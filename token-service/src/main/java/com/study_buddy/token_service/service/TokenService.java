package com.study_buddy.token_service.service;

import com.study_buddy.token_service.client.KeycloakClient;
import com.study_buddy.token_service.dto.TokenRequest;
import com.study_buddy.token_service.dto.TokenResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TokenService {
    private final KeycloakClient keycloakClient;

    public TokenResponse getToken(TokenRequest tokenRequest) {
        return keycloakClient.getToken(tokenRequest);
    }
}
