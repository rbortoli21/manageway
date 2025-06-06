package com.manageway.web.controller.project;

import com.manageway.domain.entity.Id;
import com.manageway.application.usecase.project.CreateProjectUseCase;
import com.manageway.application.usecase.project.FindProjectUseCase;
import com.manageway.web.controller.project.dtos.CreateProjectRequest;
import com.manageway.web.controller.project.dtos.CreateProjectResponse;
import com.manageway.web.controller.project.dtos.FindProjectResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("projects")
public class ProjectController {
    private final CreateProjectUseCase createProjectUseCase;
    private final FindProjectUseCase findProjectUseCase;

    public ProjectController(CreateProjectUseCase createProjectUseCase, FindProjectUseCase findProjectUseCase) {
        this.createProjectUseCase = createProjectUseCase;
        this.findProjectUseCase = findProjectUseCase;
    }

    @PostMapping
    public CreateProjectResponse create(@RequestBody @Valid CreateProjectRequest request) {
        return createProjectUseCase.create(request);
    }

    @GetMapping("/{id}")
    public FindProjectResponse find(@PathVariable("id") Id id) {
        return new FindProjectResponse().fromProject(findProjectUseCase.find(id));
    }
}
