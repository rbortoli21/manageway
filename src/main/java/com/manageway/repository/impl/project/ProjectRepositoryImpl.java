package com.manageway.repository.impl.project;

import com.manageway.domain.project.Project;
import com.manageway.repository.impl.AbstractBaseRepositoryImpl;
import com.manageway.repository.interfaces.project.ProjectRepository;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static com.manageway.generated.jooq.public_.tables.Project.PROJECT;


@Repository
public class ProjectRepositoryImpl extends AbstractBaseRepositoryImpl<Project> implements ProjectRepository {

    public ProjectRepositoryImpl(DSLContext dslContext) {
        super(dslContext, PROJECT, Project.class);
    }
}
