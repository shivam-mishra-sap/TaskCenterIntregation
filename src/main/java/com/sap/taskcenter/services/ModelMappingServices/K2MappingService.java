package com.sap.taskcenter.services.ModelMappingServices;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.sap.taskcenter.model.Response.CustomResponse;
import com.sap.taskcenter.model.Tasks.Task;

@Service
public class K2MappingService {

    public List<Task> mapK2ResponseToTask(List<CustomResponse> customResponseList) {

        return customResponseList.stream()
                .map(source -> {
                    Task task = new Task();
                    task.setTenantId(source.getApprovableId());
                    task.setApplicationInstanceId(source.getApprovableId());
                    task.setCommentsCount(source.getChangeSequenceId());
                    return task;
                })
                .collect(Collectors.toList());
    }

}
