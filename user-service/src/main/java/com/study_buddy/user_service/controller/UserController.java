package com.study_buddy.user_service.controller;

import com.study_buddy.user_service.dto.UserRequest;
import com.study_buddy.user_service.dto.UserResponse;
import com.study_buddy.user_service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse createUser(
            @RequestBody UserRequest userRequest) {
        return userService.createUser(userRequest);
    }
}
