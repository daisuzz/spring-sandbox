package com.daisuzz.logservice;

import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class LogRepository {

    public List<LogInfo> getLog() {
        return List.of(
                new LogInfo(LocalDateTime.now()),
                new LogInfo(LocalDateTime.now()),
                new LogInfo(LocalDateTime.now()),
                new LogInfo(LocalDateTime.now())
        );
    }
}
