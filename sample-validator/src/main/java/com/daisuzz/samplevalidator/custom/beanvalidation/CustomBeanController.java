package com.daisuzz.samplevalidator.custom.beanvalidation;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("custom")
public class CustomBeanController {

    @PostMapping("user")
    public ResponseEntity registerUser(@RequestBody @Validated User user,
                                       BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return ResponseEntity.of(Optional.of(bindingResult.getAllErrors()));
        }
        return ResponseEntity.ok().build();
    }
}
