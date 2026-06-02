package com.tasktracker.service;

import com.tasktracker.domain.CreateTaskRequest;
import com.tasktracker.domain.UpdateTaskRequest;
import com.tasktracker.domain.entity.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();

    Task updateTask(UUID taskId, UpdateTaskRequest request);

}
