package com.neoleap.neoleapers.controller;

import com.neoleap.neoleapers.model.SessionLog;
import com.neoleap.neoleapers.services.SessionLogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SessionLogController {


    private SessionLogService sessionLog;

    @GetMapping("/sessionLogs")
    public List<SessionLog> getAllSessionLogs (){

        return sessionLog.getAllSessionLogs();
    }
}
