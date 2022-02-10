package com.scode.controller;

import com.scode.record.UserRecord;
import com.scode.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/users")
@Tag(name = "User Reactive-API")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/all", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<UserRecord> getAll() {
        return userService.getAllUsers();
    }

}
