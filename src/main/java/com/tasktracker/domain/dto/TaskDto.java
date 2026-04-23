package com.tasktracker.domain.dto;

import com.tasktracker.domain.entity.TaskPriority;
import com.tasktracker.domain.entity.TaskStatus;
import java.time.LocalDate;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
