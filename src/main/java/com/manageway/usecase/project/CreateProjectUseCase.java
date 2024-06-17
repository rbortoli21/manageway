package com.manageway.usecase.project;

import com.manageway.domain.project.Project;
import com.manageway.repository.project.ProjectRepository;
import com.manageway.web.dtos.CreateProjectRequest;
import com.manageway.web.dtos.CreateProjectResponse;
import org.springframework.stereotype.Service;

@Service
public class CreateProjectUseCase {

    private final ProjectRepository projectRepository;

    public CreateProjectUseCase(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public CreateProjectResponse create(CreateProjectRequest request) {
        try {
            Project project = projectRepository.save(request.toProject());
            return new CreateProjectResponse(true, "Project created successfully", project);
        } catch (Exception e) {
            return new CreateProjectResponse(false, "Failed to create project - " + e.getMessage(), null);
        }


    }
}
