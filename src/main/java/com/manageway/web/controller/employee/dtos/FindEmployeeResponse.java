package com.manageway.web.controller.employee.dtos;

import com.manageway.domain.employee.Employee;
import com.manageway.domain.user.User;

public record FindEmployeeResponse(
        String name,
        String email,
        String role,
        double balance
) {

    public static FindEmployeeResponse fromEmployee(Employee employee) {
        User user = employee.getUser();
        return new FindEmployeeResponse(user.getName().value(),
                user.getEmail().value(),
                user.getRole().getTitle(),
                employee.getBalance());
    }
}
