package com.manageway.application.repository.impl.project;

import com.manageway.domain.entity.project.Project;
import com.manageway.application.repository.impl.AbstractBaseRepositoryImpl;
import com.manageway.domain.repository.project.ProjectRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProjectRepositoryImpl extends AbstractBaseRepositoryImpl<Project>, ProjectRepository {

}
