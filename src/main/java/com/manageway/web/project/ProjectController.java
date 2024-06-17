package com.manageway.web.project;

import com.manageway.usecase.project.CreateProjectUseCase;
import com.manageway.usecase.project.FindProjectUseCase;
import com.manageway.web.dtos.CreateProjectRequest;
import com.manageway.web.dtos.CreateProjectResponse;
import com.manageway.web.dtos.FindProjectResponse;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
    public CreateProjectResponse create(@RequestBody CreateProjectRequest request) {
        return createProjectUseCase.create(request);
    }

    @GetMapping
    public FindProjectResponse find(@RequestParam Map<String, String> params) {
        return findProjectUseCase.find(params);
    }
}
