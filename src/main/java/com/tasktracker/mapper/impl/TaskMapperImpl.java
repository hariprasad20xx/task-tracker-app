package com.tasktracker.mapper.impl;

import com.tasktracker.domain.CreateTaksRequest;
import com.tasktracker.domain.dto.CreateTaskRequestDto;
import com.tasktracker.domain.dto.TaskDto;
import com.tasktracker.domain.entity.Task;
import com.tasktracker.mapper.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public CreateTaksRequest fromDto(CreateTaskRequestDto dto) {
        return new CreateTaksRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.priority()
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()
        );
    }
}
