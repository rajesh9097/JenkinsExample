package com.example.JenkinsExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWroldController {

    @GetMapping(path = "/hello-world")
    public String helloWorld(){
      return "Hello World";
    }
}
