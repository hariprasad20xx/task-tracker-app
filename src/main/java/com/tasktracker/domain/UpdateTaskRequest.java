package com.tasktracker.domain;

import com.tasktracker.domain.entity.TaskPriority;
import com.tasktracker.domain.entity.TaskStatus;
import java.time.LocalDate;

public record UpdateTaskRequest(
        String title,
        String description,
        LocalDate dueDate,
        TaskStatus status,
        TaskPriority priority
) {

}
