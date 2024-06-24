package com.manageway.usecase.project;

import com.manageway.domain.project.Project;
import com.manageway.repository.interfaces.BaseRepository;
import com.manageway.usecase.customer.FindCustomerUseCase;
import com.manageway.usecase.employee.FindEmployeeUseCase;
import com.manageway.web.controller.project.dtos.CreateProjectRequest;
import com.manageway.web.controller.project.dtos.CreateProjectResponse;
import com.manageway.web.exception.ManagewayValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.Optional;

@Service
public class CreateProjectUseCase {

    private final BaseRepository<Project> projectRepository;
    private final FindEmployeeUseCase findEmployeeUseCase;
    private final FindCustomerUseCase findCustomerUseCase;

    public CreateProjectUseCase(BaseRepository<Project> projectRepository,
                                FindEmployeeUseCase findEmployeeUseCase,
                                FindCustomerUseCase findCustomerUseCase) {
        this.projectRepository = projectRepository;
        this.findEmployeeUseCase = findEmployeeUseCase;
        this.findCustomerUseCase = findCustomerUseCase;
    }

    public CreateProjectResponse create(CreateProjectRequest request) {
        Project project = request.toProject();

        project.setCustomer(findCustomerUseCase.find(request.customerId()));
        project.setEmployee(findEmployeeUseCase.find(request.employeeId()));

        String notFoundMessage = "{0} was not found in the database.";
        Optional.ofNullable(project.getEmployee()).orElseThrow(
                () -> new ManagewayValidationException(HttpStatus.BAD_REQUEST,
                        MessageFormat.format(notFoundMessage, "Employee"))
        );
        Optional.ofNullable(project.getCustomer()).orElseThrow(
                () -> new ManagewayValidationException(HttpStatus.BAD_REQUEST,
                        MessageFormat.format(notFoundMessage, "Customer"))
        );

        project = projectRepository.save(project);
        return new CreateProjectResponse(true, "Project created successfully", project);
    }
}
