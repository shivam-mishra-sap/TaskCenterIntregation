package com.sap.taskcenter.services.ModelMappingServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.sap.taskcenter.model.Response.CustomResponse;
import com.sap.taskcenter.model.TaskDefinitions.LocalizedText;
import com.sap.taskcenter.model.TaskDefinitions.TaskDefinition;
import com.sap.taskcenter.model.Tasks.Task;

@Service
public class K2MappingService {

    public Map<String,List<Task>> mapK2ResponseToTask(List<CustomResponse> customResponseList) {

        List<Task> taskList = customResponseList.stream()
                .map(source -> {
                    Task task = new Task();
                    task.setTenantId(source.getApprovableId());
                    task.setApplicationInstanceId(source.getApprovableId());
                    task.setCommentsCount(source.getChangeSequenceId());

                    //Testing
                    if(source.getChangeSequenceId() == 1){
                        task.setUrn("URNTest");
                        task.setApplicationId("ApplicationIdTest");
                        task.setApplicationInstanceId("ApplicationInstanceIdTest");
                        task.setTenantId("TenantIdTest");
                        task.setLocalId("LocalIdTest");
                        task.setDefinitionId("Test");
                        task.setStatus("READY");
                        task.setCreatedAt("2025-01-25T10:00:01.000Z");
                        task.setModifiedAt("2025-01-26T10:00:01.000Z");

                        List<LocalizedText> localizedTextList = new ArrayList<>();
                        localizedTextList.add(new LocalizedText("EN-US","Task1234",true));
                        task.setSubject(localizedTextList);

                        task.setProcessor("b0dc79c5-2b1a-4e86-92df-51ace1af7340");
                        
                        List<String> recipientUsers = new ArrayList<>();
                        recipientUsers.add("b0dc79c5-2b1a-4e86-92df-51ace1af7340");
                        task.setRecipientUsers(recipientUsers);
                    }
                    //Testing

                    return task;
                })
                .collect(Collectors.toList());

        Map<String,List<Task>> response = new HashMap<>();
        response.put("value",taskList);
        return response;
    }

    public Map<String,List<TaskDefinition>> mapK2ResponseToTaskDefination(List<CustomResponse> customResponseList) {

        LocalizedText[] localizedTextArray = new LocalizedText[10];
        localizedTextArray[0] = new LocalizedText("ENG","English",false);
        localizedTextArray[1] = new LocalizedText("FRN","French",true);

        List<TaskDefinition> taskDefinationList = customResponseList.stream()
                .map(source -> {
                    TaskDefinition taskDefination = new TaskDefinition();
                    taskDefination.setUrn("Test URN");
                    taskDefination.setApplicationId(source.getApprovableId());
                    taskDefination.setApplicationInstanceId(source.getApprovableId());
                    taskDefination.setTenantId(source.getApprovableId());
                    taskDefination.setName(localizedTextArray);
                    return taskDefination;
                })
                .collect(Collectors.toList());

        Map<String,List<TaskDefinition>> response = new HashMap<>();
        response.put("value",taskDefinationList);

        return response;
    }

}
