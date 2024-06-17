package com.manageway.usecase.project;

import com.manageway.domain.project.Project;
import com.manageway.repository.project.ProjectRepository;
import com.manageway.web.dtos.FindProjectResponse;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Service
public class FindProjectUseCase {
    private final ProjectRepository projectRepository;

    public FindProjectUseCase(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public FindProjectResponse find(Map<String, String> params) {
        Map<String, String> query = new HashMap<>();

        Field[] fields = Project.class.getDeclaredFields();
        for (Field field : fields) {
            if (params.containsKey(field.getName())) {
                query.put(field.getName(), params.get(field.getName()));
            }
        }

        Project project = projectRepository.find(query);

        return new FindProjectResponse().fromProject(project);
    }
}
