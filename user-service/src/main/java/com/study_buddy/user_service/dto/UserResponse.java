package com.study_buddy.user_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private String email;
    private String firstName;
    private String lastName;
    private Boolean emailVerified;
    private Boolean enabled;
    private String username;
}
