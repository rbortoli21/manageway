package com.manageway.web.controller.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.manageway.domain.Id;
import com.manageway.domain.PersistenceEntity;
import com.manageway.domain.project.Project;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public Id getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Id employeeId) {
        this.employeeId = employeeId;
    }

    public Id getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Id customerId) {
        this.customerId = customerId;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
