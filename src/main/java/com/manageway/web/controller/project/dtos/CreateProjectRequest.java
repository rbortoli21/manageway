package com.manageway.web.controller.project.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.manageway.domain.Id;
import com.manageway.domain.project.Project;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record CreateProjectRequest(
        @NotNull(message = "Title must be provided")
        String title,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        @NotNull(message = "Start date must be provided")
        LocalDateTime startDate,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        LocalDateTime endDate,
        Id employeeId,
        Id customerId,
        @NotNull(message = "Total price must be provided")
        Double totalPrice

) {
    public Project toProject() {
        Project project = new Project();

        project.setTitle(title);
        project.setStartDate(startDate);
        project.setEndDate(endDate);
        project.setTotalPrice(totalPrice);

        return project;
    }
}
