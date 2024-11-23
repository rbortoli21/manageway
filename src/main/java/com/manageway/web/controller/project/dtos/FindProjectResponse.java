package com.manageway.web.controller.project.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.manageway.domain.entity.Id;
import com.manageway.domain.entity.PersistenceEntity;
import com.manageway.domain.entity.project.Project;

import java.time.LocalDateTime;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FindProjectResponse {
    private String title;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Id employeeId;
    private Id customerId;
    private Double totalPrice;

    public FindProjectResponse() {
    }

    public FindProjectResponse fromProject(Project project) {
        if (project == null) {
            return this;
        }

        this.title = project.getTitle();
        this.startDate = project.getStartDate();
        this.endDate = project.getEndDate();
        this.employeeId = Optional.ofNullable(project.getEmployee()).map(PersistenceEntity::getId).orElse(null);
        this.customerId = Optional.ofNullable(project.getEmployee()).map(PersistenceEntity::getId).orElse(null);
        this.totalPrice = project.getTotalPrice();

        return this;
    }
}
