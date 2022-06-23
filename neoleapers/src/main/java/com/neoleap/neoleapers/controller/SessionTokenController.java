package com.neoleap.neoleapers.controller;

import com.neoleap.neoleapers.model.SessionToken;
import com.neoleap.neoleapers.services.SessionTokenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SessionTokenController {


    private SessionTokenService sessionToken;

    @GetMapping("/sessionTokens")
    public List<SessionToken> getAllSessionTokens (){

        return sessionToken.getAllSessionTokens();
    }
}
