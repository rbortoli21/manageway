package com.manageway.usecase.project;

import com.manageway.domain.project.Project;
import com.manageway.repository.interfaces.BaseRepository;
import com.manageway.usecase.customer.FindCustomerUseCase;
import com.manageway.usecase.employee.FindEmployeeUseCase;
import com.manageway.web.controller.project.dtos.CreateProjectRequest;
import com.manageway.web.controller.project.dtos.CreateProjectResponse;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

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

    public CreateProjectResponse create(@Valid CreateProjectRequest request) {
        try {
            Project project = request.toProject();

            //Optional.ofNullable(findEmployeeUseCase.find(project.getEmployee())).orElseThrow();
            //Optional.ofNullable(findCustomerUseCase.find(project.getCustomer())).orElseThrow();

            project = projectRepository.save(project);
            return new CreateProjectResponse(true, "Project created successfully", project);
        } catch (Exception e) {
            return new CreateProjectResponse(false, "Failed to create project - " + e.getMessage(), null);
        }


    }
}
