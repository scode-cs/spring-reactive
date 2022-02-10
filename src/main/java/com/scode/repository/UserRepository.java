package com.scode.repository;

import com.scode.record.UserRecord;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Slf4j
@Component
public class UserRepository {

    public Flux<UserRecord> getUserStream() {
        return Flux.range(1, 20).delayElements(Duration.ofSeconds(1))
                .doOnNext(data -> log.info("Processed Record: {}", data))
                .map(data -> new UserRecord(data, "User " + data));
    }

}
