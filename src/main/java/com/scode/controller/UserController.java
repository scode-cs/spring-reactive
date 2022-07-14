package com.scode.controller;

import com.scode.record.UserRecord;
import com.scode.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/users")
@Tag(name = "User Reactive-API")
public record UserController(UserService userService) {

    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<UserRecord> getAllStream() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<UserRecord> getAllJson() {
        return userService.getAllUsers();
    }

}
