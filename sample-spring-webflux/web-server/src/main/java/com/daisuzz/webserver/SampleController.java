package com.daisuzz.webserver;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.reactive.function.client.WebClient;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;
import reactor.core.publisher.Flux;

@Controller
@RequestMapping("sample")
public class SampleController {

    private final WebClient webClient;

    public SampleController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping("index")
    public String index(Model model) {

        Flux<String> flux = webClient
                .get()
                .uri("localhost:8081/log")
                .retrieve()
                .bodyToFlux(String.class);

        model.addAttribute("items", new ReactiveDataDriverContextVariable(flux, 1));

        return "index";
    }
}
