package com.daisuzz.sampleuribuilder;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
public class SampleController {

    @GetMapping
    public ResponseEntity<String> sample() {

        String value = null;

        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .query("query=age")
                .queryParam("queryParam", value)
                .queryParamIfPresent("queryParamIfPresent", Optional.ofNullable(value))
                .build().toUri();

        return ResponseEntity.created(url).build();
    }
}
