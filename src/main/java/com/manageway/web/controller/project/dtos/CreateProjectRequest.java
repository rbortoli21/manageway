package com.manageway.web.controller.project.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.manageway.domain.entity.Id;
import com.manageway.domain.entity.project.Project;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public class CreateProjectRequest {
    @NotNull(message = "Title must be provided")
    private String title;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @NotNull(message = "Start date must be provided")
    private LocalDateTime startDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endDate;
    private Id employeeId;
    private Id customerId;
    @NotNull(message = "Total price must be provided")
    private Double totalPrice;

    public Project toProject() {
        return new Project.ProjectBuilder()
                .withTitle(title)
                .withStartDate(startDate)
                .withEndDate(endDate)
                .withTotalPrice(totalPrice)
                .build();
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
