package com.study_buddy.token_service.client;

import com.study_buddy.token_service.dto.TokenRequest;
import com.study_buddy.token_service.dto.TokenResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@FeignClient(
        value = "keycloak",
        url = "${clients.keycloak.url}")
public interface KeycloakClient {
    @PostMapping(
            value = "/realms/${clients.keycloak.realm}/protocol/openid-connect/token",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    TokenResponse getToken(
            @RequestBody TokenRequest tokenRequest);
}
