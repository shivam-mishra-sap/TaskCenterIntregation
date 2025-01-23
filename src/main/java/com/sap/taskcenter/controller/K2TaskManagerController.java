package com.sap.taskcenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sap.taskcenter.model.TaskDefinitions.TaskDefinition;
import com.sap.taskcenter.model.Tasks.Task;
import com.sap.taskcenter.services.K2TaskManagerService;

@RestController
@RequestMapping("/task-provider/v2")
public class K2TaskManagerController {

    @Autowired
    private K2TaskManagerService k2TaskManagerService;

    @GetMapping("/tasks")
    public List<Task> getTasks(@RequestParam(name = "modifiedAfter", required = true) String modifiedAfter,
            @RequestParam(name = "$top") int top,
            @RequestParam(name = "languages", required = true) String languages) {

        return k2TaskManagerService.getTasks();
    }

    @GetMapping("/taskDefinitions")
    public List<TaskDefinition> getTaskDefinitions(@RequestParam(name = "$top") int top,
            @RequestParam(name = "$skip") int skip,
            @RequestParam(name = "languages", required = true) String languages) {

        return k2TaskManagerService.getTaskDefinitions();
    }

}
