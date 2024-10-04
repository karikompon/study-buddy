package com.study_buddy.user_service.client;

import com.study_buddy.user_service.dto.UserRequest;
import com.study_buddy.user_service.dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(
        value = "keycloak",
        url = "${clients.keycloak.url}")
public interface KeycloakClient {
    @PostMapping(
            value = "/admin/realms/${clients.keycloak.realm}/users",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    UserResponse createUser(
            @RequestBody UserRequest userRequest,
            @RequestHeader(name="Authorization") String token);

    @GetMapping(
            value = "/admin/realms/${clients.keycloak.realm}/users")
    List<UserResponse> getAllUsers(
            @RequestHeader (name="Authorization") String token
    );
}
