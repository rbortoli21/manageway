package com.manageway.repository.project;

import com.manageway.StaticUtils;
import com.manageway.domain.Id;
import com.manageway.domain.project.Project;
import com.manageway.repository.BaseRepository;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.springframework.stereotype.Repository;

import java.util.*;

import static com.manageway.jooq.public_.tables.Project.PROJECT;


@Repository
public class ProjectRepository implements BaseRepository<Project> {
    private final DSLContext dslContext;

    public ProjectRepository(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public Project save(Project entity) {
        Objects.requireNonNull(entity, "Project cannot be null");
        Objects.requireNonNull(entity.getCustomer(), "Customer cannot be null");
        Objects.requireNonNull(entity.getEmployee(), "Employee cannot be null");

        UUID customerId = null;
        if (entity.getCustomer().getId() != null)
            customerId = entity.getCustomer().getId().value();

        UUID employeeId = null;
        if (entity.getEmployee().getId() != null)
            employeeId = entity.getEmployee().getId().value();


        return Objects.requireNonNull(dslContext.insertInto(PROJECT)
                        .columns(PROJECT.ID, PROJECT.TITLE, PROJECT.START_DATE, PROJECT.END_DATE,
                                PROJECT.CUSTOMER_ID, PROJECT.EMPLOYEE_ID, PROJECT.TOTAL_PRICE,
                                PROJECT.TENANT_ID, PROJECT.CREATED_AT, PROJECT.UPDATED_AT)
                        .values(entity.getId().value(), entity.getTitle(), entity.getStartDate(),
                                entity.getEndDate(), customerId, employeeId,
                                entity.getTotalPrice(), entity.getTenantId().value(), entity.getCreatedAt(),
                                entity.getUpdatedAt())
                        .returning()
                        .fetchOne())
                .into(Project.class);
    }

    @Override
    public void update(Project entity) {

    }

    @Override
    public Project findById(Id id) {
        return null;
    }

    @Override
    public void delete(Project entity) {

    }

    public Project findByTitle(String title) {
        return dslContext.selectFrom(PROJECT)
                .where(PROJECT.TITLE.eq(title))
                .fetchOneInto(Project.class);
    }

    public Project find(Map<String, ?> query) {
        List<Condition> conditions = new ArrayList<>();

        for (Map.Entry<String, ?> entry : query.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            Field<Object> field = PROJECT.field(StaticUtils.toSnakeCase(key), Object.class);
            if (field != null && value != null) {
                conditions.add(field.eq(value));
            }
        }

        return dslContext.selectFrom(PROJECT)
                .where(conditions)
                .fetchOneInto(Project.class);
    }
}
