package com.sap.taskcenter.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sap.taskcenter.model.Request.Action;
import com.sap.taskcenter.model.Request.ActionPayload;
import com.sap.taskcenter.model.TaskDefinitions.TaskDefinition;
import com.sap.taskcenter.model.Tasks.Task;
import com.sap.taskcenter.services.K2TaskManagerService;

@RestController
@RequestMapping("/task-provider/v2")
public class K2TaskManagerController {

    @Autowired
    private K2TaskManagerService k2TaskManagerService;

    @GetMapping("/tasks")
    public Map<String, List<Task>> getTasks(@RequestParam(name = "modifiedAfter", required = true) String modifiedAfter,
            @RequestParam(name = "$top") int top,
            @RequestParam(name = "languages", required = true) String languages) {

        return k2TaskManagerService.getTasks();
    }

    @GetMapping("/taskDefinitions")
    public Map<String, List<TaskDefinition>> getTaskDefinitions(@RequestParam(name = "$top") int top,
            @RequestParam(name = "$skip") int skip,
            @RequestParam(name = "languages", required = true) String languages) {

        return k2TaskManagerService.getTaskDefinitions();
    }

    @PostMapping("/tasks/{taskUrn}/action")
    public Map<String, List<Task>> updateTask(@PathVariable("taskUrn") String taskUrn,
            @RequestParam("languages") String languages,
            @RequestHeader("Accept-Language") String acceptLanguage,
            @RequestBody Action action) {

        ActionPayload actionPayload = new ActionPayload("action","action","action",null);

        return k2TaskManagerService.sendActionRequest(actionPayload);

    }

}
