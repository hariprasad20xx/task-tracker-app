package com.tasktracker.mapper;

import com.tasktracker.domain.CreateTaskRequest;
import com.tasktracker.domain.UpdateTaskRequest;
import com.tasktracker.domain.dto.CreateTaskRequestDto;
import com.tasktracker.domain.dto.TaskDto;
import com.tasktracker.domain.dto.UpdateTaskRequestDto;
import com.tasktracker.domain.entity.Task;

public interface TaskMapper {

    CreateTaskRequest fromDto(CreateTaskRequestDto dto);

    UpdateTaskRequest fromDto(UpdateTaskRequestDto dto);

    TaskDto toDto(Task task);
}
