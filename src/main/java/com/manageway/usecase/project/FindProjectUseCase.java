package com.manageway.usecase.project;

import com.manageway.domain.Id;
import com.manageway.domain.project.Project;
import com.manageway.repository.interfaces.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class FindProjectUseCase {
    private final BaseRepository<Project> projectRepository;

    public FindProjectUseCase(BaseRepository<Project> projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project find(Id id) {
        return projectRepository.find(id);
    }
}
