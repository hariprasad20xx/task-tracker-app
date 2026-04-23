package com.tasktracker.service;

import com.tasktracker.domain.CreateTaksRequest;
import com.tasktracker.domain.entity.Task;

public interface TaskService {
    Task createTask(CreateTaksRequest request);
}
