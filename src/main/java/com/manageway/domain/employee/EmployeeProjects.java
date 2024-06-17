package com.manageway.domain.employee;

import com.manageway.domain.PersistenceEntity;
import com.manageway.domain.project.Project;


public class EmployeeProjects extends PersistenceEntity {
    private Employee employee;
    private Project project;

    @Override
    public void refreshReferences() {

    }

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
}
