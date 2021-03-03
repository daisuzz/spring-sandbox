package com.dais39.samplespringinterceptor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/foo")
    public String foo() {

        return "foo";
    }

    @GetMapping("/bar")
    public String bar() {

        return "bar";
    }

    @GetMapping("/hoge")
    public String hoge() {

        return "hoge";
    }
}
