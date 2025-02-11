package com.sap.taskcenter.services.ModelMappingServices;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
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

                    if (source.getChangeSequenceId() == 1) {

                        task.setApplicationId("ApplicationId" + "_" + source.getChangeSequenceId());
                        task.setApplicationInstanceId("ApplicationInstanceId" + "_" + source.getChangeSequenceId());
                        task.setTenantId("TenantId" + "_" + source.getChangeSequenceId());
                        task.setLocalId("LocalId" + "_" + source.getChangeSequenceId());
                        task.setUrn("urn" + ":" + "sap.odm.bpm.task" + ":" + task.getApplicationId() + ":"
                                + task.getApplicationInstanceId() + ":" + task.getTenantId() + ":" + task.getLocalId());

                        task.setDefinitionId(
                                "urn" + ":" + "sap.odm.bpm.taskdefinition" + ":" + task.getApplicationId() + ":"
                                        + task.getApplicationInstanceId() + ":" + task.getTenantId() + ":"
                                        + task.getLocalId());

                        task.setStatus("READY");

                        // Get current time minus 10 minutes
                        Instant createdAt = Instant.now().minus(10 * source.getChangeSequenceId(), ChronoUnit.MINUTES);
                        Instant modifiedAt = Instant.now().minus(5 * source.getChangeSequenceId(), ChronoUnit.MINUTES);

                        task.setCreatedAt(createdAt.toString());
                        task.setModifiedAt(modifiedAt.toString());
                        task.setCreatedBy("b0dc79c5-2b1a-4e86-92df-51ace1af7340");
                        task.setModifiedBy("b0dc79c5-2b1a-4e86-92df-51ace1af7340");

                        task.setProcessor("b0dc79c5-2b1a-4e86-92df-51ace1af7340");

                        List<LocalizedText> localizedTextList = new ArrayList<>();
                        localizedTextList
                                .add(new LocalizedText("en-US", "New Laptop Lenovo Yoga (Model : " + source.getChangeSequenceId()*10 + ")", true));
                        task.setSubject(localizedTextList);

                        task.setPriority("VERY_HIGH");

                        task.setCommentsCount(source.getChangeSequenceId()*10);

                        task.setValidResponseCodes(new ArrayList<>(Arrays.asList("approve","deny")));

                        task.setValidActionCodes(new ArrayList<>(Arrays.asList("increasePrio","extendETA")));

                        task.setRecipientUsers(new ArrayList<>(Arrays.asList("b0dc79c5-2b1a-4e86-92df-51ace1af7340")));

                    }

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

                    if (source.getChangeSequenceId() == 1) {

                        taskDefination.setApplicationId("ApplicationId" + "_" + source.getChangeSequenceId());
                        taskDefination
                                .setApplicationInstanceId("ApplicationInstanceId" + "_" + source.getChangeSequenceId());
                        taskDefination.setTenantId("TenantId" + "_" + source.getChangeSequenceId());
                        taskDefination.setLocalId("LocalId" + "_" + source.getChangeSequenceId());
                        taskDefination.setUrn(
                                "urn" + ":" + "sap.odm.bpm.taskdefinition" + ":" + taskDefination.getApplicationId()
                                        + ":"
                                        + taskDefination.getApplicationInstanceId() + ":" + taskDefination.getTenantId()
                                        + ":" + taskDefination.getLocalId());

                        LocalizedText[] localizedTextArray = new LocalizedText[1];
                        localizedTextArray[0] = new LocalizedText("en-US", "Release of Debit Memo Request", true);
                        taskDefination.setName(localizedTextArray);

                        Capabilities[] capabilitiesArray1 = new Capabilities[1];
                        capabilitiesArray1[0] = new Capabilities(Name.TASKS_BULK_OPERATIONS, true);

                        ResponseDefinition responseDefinition1 = new ResponseDefinition("0001",
                                new LocalizedText[] { new LocalizedText("en-US", "Release", true) }, Nature.POSITIVE,
                                CommentRequired.OPTIONAL, ReasonRequired.UNSUPPORTED, new ArrayList<>(),
                                capabilitiesArray1);

                        ResponseDefinition responseDefinition2 = new ResponseDefinition("0002",
                                new LocalizedText[] { new LocalizedText("en-US", "Reject", true) }, Nature.NEUTRAL,
                                CommentRequired.OPTIONAL, ReasonRequired.UNSUPPORTED, new ArrayList<>(),
                                capabilitiesArray1);

                        ResponseDefinition responseDefinition3 = new ResponseDefinition("0003",
                                new LocalizedText[] { new LocalizedText("en-US", "Request Rework", true) },
                                Nature.NEGATIVE,
                                CommentRequired.OPTIONAL, ReasonRequired.UNSUPPORTED, new ArrayList<>(),
                                capabilitiesArray1);

                        List<ResponseDefinition> possibleResponses = new ArrayList<>();
                        possibleResponses.add(responseDefinition1);
                        possibleResponses.add(responseDefinition2);
                        possibleResponses.add(responseDefinition3);
                        taskDefination.setPossibleResponses(possibleResponses);

                        List<CustomAttributeDefinition> customAttributes = new ArrayList<>();

                        customAttributes.add(new CustomAttributeDefinition("CREATEDBY", "STRING", "",
                                new LocalizedText[] { new LocalizedText("en-US", "Document Created By", true) }, 0));
                        customAttributes.add(new CustomAttributeDefinition("CREATEDBYNAME", "STRING", "",
                                new LocalizedText[] { new LocalizedText("en-US", "Document Created By (Name)", true) },
                                0));
                        customAttributes.add(new CustomAttributeDefinition("SOLDTOPARTY", "STRING", "",
                                new LocalizedText[] { new LocalizedText("en-US", "Sold-to Party", true) }, 0));
                        customAttributes.add(new CustomAttributeDefinition("SOLDTOPARTYNAME", "STRING", "",
                                new LocalizedText[] { new LocalizedText("en-US", "Sold-to Party (Name)", true) }, 0));
                        customAttributes.add(new CustomAttributeDefinition("TOTAL_NETAMOUNT", "FLOAT", "",
                                new LocalizedText[] { new LocalizedText("en-US", "Net Value", true) }, 0));
                        customAttributes.add(new CustomAttributeDefinition("TRANSATION_CURRENCY", "STRING", "",
                                new LocalizedText[] { new LocalizedText("en-US", "Transaction Currency", true) }, 0));
                        taskDefination.setCustomAttributes(customAttributes);

                        Capabilities[] capabilitiesArray = new Capabilities[6];
                        capabilitiesArray[0] = new Capabilities(Name.ATTACHMENTS, true);
                        capabilitiesArray[1] = new Capabilities(Name.ATTACHMENTS_CREATE, true);
                        capabilitiesArray[2] = new Capabilities(Name.COMMENTS, true);
                        capabilitiesArray[3] = new Capabilities(Name.COMMENTS_CREATE, true);
                        capabilitiesArray[4] = new Capabilities(Name.TASKS_DESCRIPTION, true);
                        capabilitiesArray[5] = new Capabilities(Name.SUBSTITUTIONS, true);
                        taskDefination.setCapabilities(capabilitiesArray);

                        IFrameUISettings iframeSettings = new IFrameUISettings(true, true, true, "");
                        WebUISettings webUISettings = new WebUISettings("IFrame", iframeSettings);

                        // Create DataDriven UI settings
                        DataDetailsParameters dataDetailsParams = new DataDetailsParameters("", "");
                        DataDrivenUISettings dataDrivenUISettings = new DataDrivenUISettings(dataDetailsParams);
                        MobileUISettings mobileUISettings = new MobileUISettings("DataDriven", dataDrivenUISettings);

                        // Create TaskDetailsSettings with both WebUI and MobileUI settings
                        TaskDetailsSettings taskDetailsSettings = new TaskDetailsSettings(webUISettings,
                                mobileUISettings);
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
