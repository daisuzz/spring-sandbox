package com.daisuzz.logservice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LogService {

    private final LogRepository logRepository;

    public List<LogInfo> getLog() {
        return logRepository.getLog();
    }
}
