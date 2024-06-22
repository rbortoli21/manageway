package com.manageway.usecase.project;

import com.manageway.domain.Id;
import com.manageway.domain.project.Project;
import com.manageway.repository.impl.project.ProjectRepositoryImpl;
import com.manageway.repository.project.ProjectRepository;
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
