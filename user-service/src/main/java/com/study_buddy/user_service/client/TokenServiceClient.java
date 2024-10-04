package com.study_buddy.user_service.client;

import com.study_buddy.user_service.dto.TokenRequest;
import com.study_buddy.user_service.dto.TokenResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@FeignClient(
        value = "token-service",
        url = "http://localhost:8082")
public interface TokenServiceClient {
    @PostMapping(
            value = "/api/token",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    TokenResponse generateToken(@RequestBody TokenRequest tokenRequest);
}
