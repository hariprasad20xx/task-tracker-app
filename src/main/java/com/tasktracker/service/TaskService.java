package com.tasktracker.service;

import com.tasktracker.domain.CreateTaskRequest;
import com.tasktracker.domain.entity.Task;

import java.util.List;

public interface TaskService {
    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();

}
