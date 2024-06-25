package com.manageway.domain.employee;

import com.manageway.domain.PersistenceEntity;
import com.manageway.domain.project.Project;
import com.manageway.generated.jooq.public_.tables.records.EmployeeProjectsRecord;


public class EmployeeProjects extends PersistenceEntity {
    private Employee employee;
    private Project project;

    public EmployeeProjects() {
    }

    public EmployeeProjects(Employee employee, Project project) {
        this.employee = employee;
        this.project = project;
    }

    public Employee getUser() {
        return employee;
    }

    public void setUser(Employee employee) {
        this.employee = employee;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public EmployeeProjectsRecord toRecord() {
        EmployeeProjectsRecord record = new EmployeeProjectsRecord();

        record.setId(id.value());
        record.setEmployeeId(employee.getId().value());
        record.setProjectId(project.getId().value());
        record.setCreatedAt(createdAt);
        record.setUpdatedAt(updatedAt);
        record.setTenantId(tenantId.value());

        return record;
    }
}
