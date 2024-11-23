package com.manageway.web.controller.employee;

import com.manageway.domain.entity.Id;
import com.manageway.application.usecase.employee.FindEmployeeUseCase;
import com.manageway.web.controller.employee.dtos.FindEmployeeResponse;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employees")
public class EmployeeController {

    private final FindEmployeeUseCase findEmployeeUseCase;

    public EmployeeController(FindEmployeeUseCase findEmployeeUseCase) {
        this.findEmployeeUseCase = findEmployeeUseCase;
    }

    @GetMapping("/{id}")
    public FindEmployeeResponse find(@PathParam("id") Id id) {
        return FindEmployeeResponse.fromEmployee(findEmployeeUseCase.find(id));
    }
}
