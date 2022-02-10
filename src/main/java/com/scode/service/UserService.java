package com.scode.service;

import com.scode.record.UserRecord;
import com.scode.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Flux<UserRecord> getAllUsers() {
        return userRepository.getUserStream();
    }

}
