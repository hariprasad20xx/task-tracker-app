package com.tasktracker.mapper;

import com.tasktracker.domain.CreateTaksRequest;
import com.tasktracker.domain.dto.CreateTaskRequestDto;
import com.tasktracker.domain.dto.TaskDto;
import com.tasktracker.domain.entity.Task;

public interface TaskMapper {

    CreateTaksRequest fromDto(CreateTaskRequestDto dto);

    TaskDto toDto(Task task);
}
