package com.manageway.usecase.project;

import com.manageway.domain.Id;
import com.manageway.domain.project.Project;
import com.manageway.domain.repository.project.ProjectRepository;
import com.manageway.impl.repository.project.ProjectRepositoryImpl;
import org.springframework.stereotype.Service;

@Service
public class FindProjectUseCase {
    private final ProjectRepository projectRepository;

    public FindProjectUseCase(ProjectRepositoryImpl projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project find(Id id) {
        return projectRepository.find(id);
    }
}
