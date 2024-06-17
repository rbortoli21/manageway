package com.manageway.web.dtos;

import com.manageway.domain.project.Project;

public class CreateProjectResponse {
    private Boolean success;
    private String message;
    private Project project;

    public CreateProjectResponse(Boolean success, String message, Project project) {
        this.success = success;
        this.message = message;
        this.project = project;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
