package com.daisuzz.samplepropertyeditor.controller;

import com.daisuzz.samplepropertyeditor.propertyeditor.NullSupportCustomBooleanEditor;
import jakarta.validation.Valid;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Boolean.class, new NullSupportCustomBooleanEditor(false));
    }

    @GetMapping("person")
    public PersonForm person(@Valid PersonForm form) {
        return form;
    }
}
