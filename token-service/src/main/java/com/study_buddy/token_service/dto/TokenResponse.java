package com.study_buddy.token_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenResponse {
    private String access_token;
    private Integer expires_in;
    private Integer refresh_expires_in;
    private String refresh_token;
    private String token_type;
    private String session_state;
    private String scope;
}
