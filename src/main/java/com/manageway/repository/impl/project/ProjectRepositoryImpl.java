package com.manageway.repository.impl.project;

import com.manageway.domain.Id;
import com.manageway.domain.customer.Customer;
import com.manageway.domain.employee.Employee;
import com.manageway.domain.project.Project;
import com.manageway.generated.jooq.public_.tables.records.ProjectRecord;
import com.manageway.repository.project.ProjectRepository;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Optional;

import static com.manageway.generated.jooq.public_.tables.Project.PROJECT;


@Repository
public class ProjectRepositoryImpl implements ProjectRepository {
    private final DSLContext dslContext;

    public ProjectRepositoryImpl(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public Project save(Project entity) {
        ProjectRecord projectRecord = toRecord(entity);
        projectRecord.insert();

        return entity;

    }

    @Override
    public void update(Project entity) {

    }

    @Override
    public Project find(Id id) {
        return dslContext.selectFrom(PROJECT)
                .where(PROJECT.ID.eq(id.value()))
                .fetchOneInto(Project.class);
    }

    @Override
    public void delete(Project entity) {

    }

    ProjectRecord toRecord(Project project) {
        ProjectRecord projectRecord = dslContext.newRecord(PROJECT);

        projectRecord.setId(project.getId().value());
        projectRecord.setTitle(project.getTitle());
        projectRecord.setStartDate(project.getStartDate());
        projectRecord.setEndDate(project.getEndDate());

        Optional.ofNullable(project.getCustomer())
                .map(Customer::getId)
                .map(Id::value)
                .ifPresent(projectRecord::setCustomerId);
        Optional.ofNullable(project.getEmployee())
                .map(Employee::getId)
                .map(Id::value)
                .ifPresent(projectRecord::setEmployeeId);

        projectRecord.setTotalPrice(BigDecimal.valueOf(project.getTotalPrice()));
        projectRecord.setTenantId(project.getTenantId().value());
        projectRecord.setCreatedAt(project.getCreatedAt());
        projectRecord.setUpdatedAt(project.getUpdatedAt());

        return projectRecord;
    }
}
