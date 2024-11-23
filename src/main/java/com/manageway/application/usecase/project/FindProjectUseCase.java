package com.manageway.application.usecase.project;

import com.manageway.domain.entity.Id;
import com.manageway.domain.entity.project.Project;
import com.manageway.domain.repository.project.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class FindProjectUseCase {
    private final ProjectRepository projectRepository;

    public FindProjectUseCase(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project find(Id id) {
        return projectRepository.find(id);
    }
}
