package com.tasktracker.service;

import com.tasktracker.domain.CreateTaskRequest;
import com.tasktracker.domain.entity.Task;

public interface TaskService {
    Task createTask(CreateTaskRequest request);
}
