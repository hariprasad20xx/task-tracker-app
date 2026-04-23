package com.tasktracker.service.impl;

import com.tasktracker.domain.CreateTaksRequest;
import com.tasktracker.domain.entity.Task;
import com.tasktracker.domain.entity.TaskStatus;
import com.tasktracker.repository.TaskRepository;
import com.tasktracker.service.TaskService;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(CreateTaksRequest request) {
        Instant now = Instant.now();

        Task task = new Task(
                null,
                request.title(),
                request.description(),
                request.dueDate(),
                TaskStatus.OPEN,
                request.priority(),
                now,
                now
        );

        return taskRepository.save(task);
    }
}
