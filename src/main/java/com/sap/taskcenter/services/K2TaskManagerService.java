package com.sap.taskcenter.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.databind.JsonNode;
import com.sap.taskcenter.model.Response.ApiResponse;
import com.sap.taskcenter.model.TaskDefinitions.TaskDefinition;
import com.sap.taskcenter.model.Tasks.Task;
import com.sap.taskcenter.services.ModelMappingServices.K2MappingService;

@Service
public class K2TaskManagerService {

    @Autowired
    private WebClient webClient;

    @Autowired
    private K2MappingService k2MappingService;

    public Map<String,List<Task>> getTasks() {

        ApiResponse response = webClient.get().uri("/changes?realm=123/")
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .block();

        if (response == null) {
            throw new RuntimeException("Failed to fetch response from K2 System");
        }

        // System.out.println(response);

        return k2MappingService.mapK2ResponseToTask(response.getValue());
        
    }

    public Map<String,List<TaskDefinition>> getTaskDefinitions() {

        ApiResponse response = webClient.get().uri("/changes?realm=123/")
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .block();

        if (response == null) {
            throw new RuntimeException("Failed to fetch response from K2 System");
        }

        // System.out.println(response);

        return k2MappingService.mapK2ResponseToTaskDefination(response.getValue());

    }

}
