package com.daisuzz.logservice;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@AllArgsConstructor
public class LogController {

    private final LogService logService;

    @GetMapping("log")
    public Flux<LogInfo> getLog() {

        List<LogInfo> logInfo = logService.getLog();

        return Flux.fromIterable(logInfo);
    }
}
