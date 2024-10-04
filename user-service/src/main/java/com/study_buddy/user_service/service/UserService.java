package com.study_buddy.user_service.service;

import com.study_buddy.user_service.client.KeycloakClient;
import com.study_buddy.user_service.client.TokenServiceClient;
import com.study_buddy.user_service.dto.TokenRequest;
import com.study_buddy.user_service.dto.UserRequest;
import com.study_buddy.user_service.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final KeycloakClient keycloakClient;
    private final TokenServiceClient tokenServiceClient;

    public UserResponse createUser(UserRequest userRequest) {
        return keycloakClient.createUser(userRequest, getAdminToken());
    }

    private String getAdminToken() {
        return "Bearer " + tokenServiceClient.generateToken(new TokenRequest(
                        "password",
                        "${clients.keycloak.client}",
                        "${clients.keycloak.admin.username}",
                        "${clients.keycloak.admin.password}"))
                .getAccess_token();
    }
}
