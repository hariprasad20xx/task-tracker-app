package com.tasktracker.controller;

import com.tasktracker.domain.CreateTaskRequest;
import com.tasktracker.domain.dto.CreateTaskRequestDto;
import com.tasktracker.domain.dto.TaskDto;
import com.tasktracker.domain.entity.Task;
import com.tasktracker.mapper.TaskMapper;
import com.tasktracker.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/vi/tasks")
public class TaskController {

    private final TaskService taskService;
    private final TaskMapper taskMapper;

    public TaskController(TaskService taskService, TaskMapper taskMapper) {
        this.taskService = taskService;
        this.taskMapper = taskMapper;
    }

}
