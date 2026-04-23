package com.tasktracker.domain.dto;

import com.tasktracker.domain.entity.TaskPriority;
import java.time.LocalDate;

public record CreateTaskRequestDto(
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority
) {

}
