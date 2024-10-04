package com.study_buddy.token_service.controller;

import com.study_buddy.token_service.dto.TokenRequest;
import com.study_buddy.token_service.dto.TokenResponse;
import com.study_buddy.token_service.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TokenController {
    private final TokenService tokenService;

    @PostMapping("/token")
    @ResponseStatus(HttpStatus.OK)
    public TokenResponse generateToken(
            @RequestBody TokenRequest tokenRequest) {
        return tokenService.getToken(tokenRequest);
    }
}
