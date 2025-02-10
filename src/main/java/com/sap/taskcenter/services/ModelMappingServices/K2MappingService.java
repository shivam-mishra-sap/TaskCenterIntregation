package com.sap.taskcenter.services.ModelMappingServices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.sap.taskcenter.model.Response.CustomResponse;
import com.sap.taskcenter.model.TaskDefinitions.Capabilities;
import com.sap.taskcenter.model.TaskDefinitions.CustomAttributeDefinition;
import com.sap.taskcenter.model.TaskDefinitions.DataDetailsParameters;
import com.sap.taskcenter.model.TaskDefinitions.DataDrivenUISettings;
import com.sap.taskcenter.model.TaskDefinitions.IFrameUISettings;
import com.sap.taskcenter.model.TaskDefinitions.LocalizedText;
import com.sap.taskcenter.model.TaskDefinitions.MobileUISettings;
import com.sap.taskcenter.model.TaskDefinitions.ResponseDefinition;
import com.sap.taskcenter.model.TaskDefinitions.TaskDefinition;
import com.sap.taskcenter.model.TaskDefinitions.TaskDetailsSettings;
import com.sap.taskcenter.model.TaskDefinitions.WebUISettings;
import com.sap.taskcenter.model.TaskDefinitions.Enums.CommentRequired;
import com.sap.taskcenter.model.TaskDefinitions.Enums.Name;
import com.sap.taskcenter.model.TaskDefinitions.Enums.Nature;
import com.sap.taskcenter.model.TaskDefinitions.Enums.ReasonRequired;
import com.sap.taskcenter.model.Tasks.Task;

@Service
public class K2MappingService {

    public Map<String, List<Task>> mapK2ResponseToTask(List<CustomResponse> customResponseList) {

        List<Task> taskList = customResponseList.stream()
                .map(source -> {
                    Task task = new Task();
                    task.setTenantId(source.getApprovableId());
                    task.setApplicationInstanceId(source.getApprovableId());
                    task.setCommentsCount(source.getChangeSequenceId());

                    // Testing
                    if (source.getChangeSequenceId() == 1) {
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
                        localizedTextList.add(new LocalizedText("EN-US", "Task1234", true));
                        task.setSubject(localizedTextList);

                        task.setProcessor("b0dc79c5-2b1a-4e86-92df-51ace1af7340");

                        List<String> recipientUsers = new ArrayList<>();
                        recipientUsers.add("b0dc79c5-2b1a-4e86-92df-51ace1af7340");
                        task.setRecipientUsers(recipientUsers);
                    }
                    // Testing

                    return task;
                })
                .collect(Collectors.toList());

        Map<String, List<Task>> response = new HashMap<>();
        response.put("value", taskList);
        return response;
    }

    public Map<String, List<TaskDefinition>> mapK2ResponseToTaskDefination(List<CustomResponse> customResponseList) {

        List<TaskDefinition> taskDefinationList = customResponseList.stream()
                .map(source -> {
                    
                    TaskDefinition taskDefination = new TaskDefinition();

                    // Testing
                    if (source.getChangeSequenceId() == 1) {
                        taskDefination.setUrn("urn:sap.odm.bpm.taskdefinition:s4hana:ab1:100: TS01800262_WS01800202_0000000009");
                        taskDefination.setApplicationId("s4hana");
                        taskDefination.setApplicationInstanceId("ab1");
                        taskDefination.setTenantId("1000");
                        taskDefination.setLocalId("TS01800262_WS01800202_0000000009");

                        LocalizedText[] localizedTextArray = new LocalizedText[10];
                        localizedTextArray[0] = new LocalizedText("en-US", "Release of Debit Memo Request", true);
                        taskDefination.setName(localizedTextArray);

                        ResponseDefinition responseDefinition1 = new ResponseDefinition("0001", localizedTextArray, Nature.NEUTRAL, 
                        CommentRequired.OPTIONAL, ReasonRequired.UNSUPPORTED, new ArrayList<>(), new Capabilities(Name.TASKS_DESCRIPTION,true));

                        ResponseDefinition responseDefinition2 = new ResponseDefinition("0002", localizedTextArray, Nature.POSITIVE, 
                        CommentRequired.OPTIONAL, ReasonRequired.UNSUPPORTED, new ArrayList<>(), new Capabilities(Name.TASKS_DESCRIPTION,true));

                        ResponseDefinition responseDefinition3 = new ResponseDefinition("0003", localizedTextArray, Nature.NEGATIVE, 
                        CommentRequired.OPTIONAL, ReasonRequired.UNSUPPORTED, new ArrayList<>(), new Capabilities(Name.TASKS_DESCRIPTION,true));

                        List<ResponseDefinition> possibleResponses = new ArrayList<>();
                        possibleResponses.add(responseDefinition1);
                        possibleResponses.add(responseDefinition2);
                        possibleResponses.add(responseDefinition3);
                        taskDefination.setPossibleResponses(possibleResponses);

                        List<CustomAttributeDefinition> customAttributes = new ArrayList<>();
                        customAttributes.add(new CustomAttributeDefinition("CREATEDBY","STRING","",localizedTextArray,0));
                        customAttributes.add(new CustomAttributeDefinition("CREATEDBYNAME","STRING","",localizedTextArray,0));
                        customAttributes.add(new CustomAttributeDefinition("SOLDTOPARTY","STRING","",localizedTextArray,0));
                        customAttributes.add(new CustomAttributeDefinition("TOTAL_NETAMOUNT","FLOAT","",localizedTextArray,0));
                        customAttributes.add(new CustomAttributeDefinition("TRANSACTION_CURRENCY","STRING","",localizedTextArray,0));

                        Capabilities[] capabilitiesArray = new Capabilities[6];
                        capabilitiesArray[0] = new Capabilities(Name.ATTACHMENTS,true);
                        capabilitiesArray[1] = new Capabilities(Name.ATTACHMENTS_CREATE,true);
                        capabilitiesArray[2] = new Capabilities(Name.COMMENTS,true);
                        capabilitiesArray[3] = new Capabilities(Name.COMMENTS_CREATE,true);
                        capabilitiesArray[4] = new Capabilities(Name.TASKS_DESCRIPTION,true);
                        capabilitiesArray[5] = new Capabilities(Name.COMMENTS,true);

                        IFrameUISettings iframeSettings = new IFrameUISettings(true, true, true, "");
                        WebUISettings webUISettings = new WebUISettings("IFrame", iframeSettings);

                        // Create DataDriven UI settings
                        DataDetailsParameters dataDetailsParams = new DataDetailsParameters("", "");
                        DataDrivenUISettings dataDrivenUISettings = new DataDrivenUISettings(dataDetailsParams);
                        MobileUISettings mobileUISettings = new MobileUISettings("DataDriven", dataDrivenUISettings);

                        // Create TaskDetailsSettings with both WebUI and MobileUI settings
                        TaskDetailsSettings taskDetailsSettings = new TaskDetailsSettings(webUISettings, mobileUISettings);
                        taskDefination.setTaskDetailsSettings(taskDetailsSettings);

                    }
                    
                    return taskDefination;
                })
                .collect(Collectors.toList());

        Map<String, List<TaskDefinition>> response = new HashMap<>();
        response.put("value", taskDefinationList);

        return response;
    }

}
