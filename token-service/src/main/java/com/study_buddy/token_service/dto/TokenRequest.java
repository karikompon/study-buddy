package com.study_buddy.token_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenRequest {
    private String grant_type;
    private String client_id;
    private String username;
    private String password;
}
