package com.neoleap.neoleapers.services;

import com.neoleap.neoleapers.model.SessionLog;
import com.neoleap.neoleapers.repository.SessionLogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionLogService {


    private final SessionLogRepository sessionLogRepository;

    public SessionLogService(SessionLogRepository sessionLogRepository) {
        this.sessionLogRepository = sessionLogRepository;
    }


    public List<SessionLog> getAllSessionLogs () {

        return  sessionLogRepository.findAll();
    }
}
