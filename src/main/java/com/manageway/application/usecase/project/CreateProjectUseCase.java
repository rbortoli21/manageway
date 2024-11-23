package com.manageway.application.usecase.project;

import com.manageway.domain.entity.project.Project;
import com.manageway.domain.repository.project.ProjectRepository;
import com.manageway.application.usecase.customer.FindCustomerUseCase;
import com.manageway.application.usecase.employee.FindEmployeeUseCase;
import com.manageway.web.controller.project.dtos.CreateProjectRequest;
import com.manageway.web.controller.project.dtos.CreateProjectResponse;
import com.manageway.web.exception.ManagewayValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.Optional;

@Service
public class CreateProjectUseCase {
    private final ProjectRepository projectRepository;
    private final FindEmployeeUseCase findEmployeeUseCase;
    private final FindCustomerUseCase findCustomerUseCase;

    public CreateProjectUseCase(ProjectRepository projectRepository,
                                FindEmployeeUseCase findEmployeeUseCase,
                                FindCustomerUseCase findCustomerUseCase) {
        this.projectRepository = projectRepository;
        this.findEmployeeUseCase = findEmployeeUseCase;
        this.findCustomerUseCase = findCustomerUseCase;
    }

    public CreateProjectResponse create(CreateProjectRequest request) {
        Project project = request.toProject();

        project.setCustomer(findCustomerUseCase.find(request.getCustomerId()));
        project.setEmployee(findEmployeeUseCase.find(request.getEmployeeId()));

        String notFoundMessage = "{0} was not found in the database.";
        Optional.ofNullable(project.getEmployee()).orElseThrow(
                () -> new ManagewayValidationException(HttpStatus.BAD_REQUEST,
                        MessageFormat.format(notFoundMessage, "Employee"))
        );
        Optional.ofNullable(project.getCustomer()).orElseThrow(
                () -> new ManagewayValidationException(HttpStatus.BAD_REQUEST,
                        MessageFormat.format(notFoundMessage, "Customer"))
        );

        project = projectRepository.persist(project);
        return new CreateProjectResponse(true, "Project created successfully", project);
    }
}
