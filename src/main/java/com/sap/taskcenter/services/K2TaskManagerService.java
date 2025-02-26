package com.sap.taskcenter.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.sap.taskcenter.model.Capabilities.Capabilities;
import com.sap.taskcenter.model.Request.SourcingProject;
import com.sap.taskcenter.model.Response.SourcingProjectsListResponse;
import com.sap.taskcenter.model.TaskDefinitions.TaskDefinition;
import com.sap.taskcenter.model.Tasks.Task;
import com.sap.taskcenter.services.ModelMappingServices.K2MappingService;

@Service
public class K2TaskManagerService {

    @Autowired
    private WebClient webClient;

    @Autowired
    private K2MappingService k2MappingService;

    private String realm;

    @Value("${user}")
    private String user;

    @Value("${passwordAdapter}")
    private String passwordAdapter;

    String filter = "((createDateFrom gt 1736403239000 and createDateTo lt 1740391589000))";
    String projectId = "WS3273973";

    public Map<String, List<Task>> getTasks() {

        SourcingProjectsListResponse response = webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/prod/projects")
                        .queryParam("$filter", filter)
                        .queryParam("realm", realm)
                        .queryParam("user", user)
                        .queryParam("passwordAdapter", passwordAdapter)
                        .build(true))
                .retrieve()
                .bodyToMono(SourcingProjectsListResponse.class)
                .block();

        if (response == null) {
            throw new RuntimeException("Failed to fetch response from K2 System");
        }

        return k2MappingService.mapK2ResponseToTask(response.getPayload());

    }

    public Map<String, List<TaskDefinition>> getTaskDefinitions() {

        SourcingProjectsListResponse response = webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/prod/projects")
                        .queryParam("$filter", filter)
                        .queryParam("realm", realm)
                        .queryParam("user", user)
                        .queryParam("passwordAdapter", passwordAdapter)
                        .build(true))
                .retrieve()
                .bodyToMono(SourcingProjectsListResponse.class)
                .block();

        if (response == null) {
            throw new RuntimeException("Failed to fetch response from K2 System");
        }

        return k2MappingService.mapK2ResponseToTaskDefination(response.getPayload());

    }

    public Map<String, List<Capabilities>> getCapabilities() {

        HashMap<String, List<Capabilities>> response = new HashMap<>();

        List<Capabilities> list = new ArrayList<>();
        list.add(new Capabilities("tasks.pull", "true"));
        list.add(new Capabilities("taskDefinitions.pull", "true"));
        list.add(new Capabilities("tasks.push", "false"));
        list.add(new Capabilities("substitutions", "false"));
        list.add(new Capabilities("user.existence", "false"));
        list.add(new Capabilities("global.operations", "false"));

        response.put("value", list);

        return response;
    }

    public Task sendTaskDetails(SourcingProject sourcingProject) {

        String response = webClient.put()
                .uri(uriBuilder -> uriBuilder
                        .path("/sandbox/projects/" + projectId)
                        .queryParam("realm", realm)
                        .queryParam("user", user)
                        .queryParam("passwordAdapter", passwordAdapter)
                        .build(true))
                .bodyValue(sourcingProject)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        if (response == null) {
            throw new RuntimeException("Failed to fetch response from K2 System");
        }

        System.out.println(response.toString());

        return k2MappingService.mapK2ResponseToTask(response);
    }

}
