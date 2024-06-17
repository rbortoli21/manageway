package com.manageway.web.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.manageway.domain.Id;
import com.manageway.domain.customer.Customer;
import com.manageway.domain.employee.Employee;
import com.manageway.domain.project.Project;

import java.time.LocalDateTime;

public record CreateProjectRequest(
        String title,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        LocalDateTime startDate,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        LocalDateTime endDate,
        Id employeeId,
        Id customerId,
        Double totalPrice

) {
    public Project toProject() {
        Project project = new Project();

        project.setTitle(title);
        project.setStartDate(startDate);
        project.setEndDate(endDate);
        project.setEmployee(new Employee(employeeId));
        project.setCustomer(new Customer(customerId));
        project.setTotalPrice(totalPrice);

        return project;
    }
}
