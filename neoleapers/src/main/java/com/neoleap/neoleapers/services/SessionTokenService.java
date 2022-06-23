package com.neoleap.neoleapers.services;

import com.neoleap.neoleapers.model.SessionToken;
import com.neoleap.neoleapers.repository.SessionTokenRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionTokenService {


    private final SessionTokenRepository sessionTokenRepository;

    public SessionTokenService(SessionTokenRepository sessionTokenRepository) {
        this.sessionTokenRepository = sessionTokenRepository;
    }


    public List<SessionToken> getAllSessionTokens () {

        return  sessionTokenRepository.findAll();
    }
}
