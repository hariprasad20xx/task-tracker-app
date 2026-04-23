package com.tasktracker.domain;

import com.tasktracker.domain.entity.TaskPriority;

import java.time.LocalDate;

public record CreateTaksRequest(
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority
) {
}
