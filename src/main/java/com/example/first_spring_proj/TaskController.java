package com.example.first_spring_proj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {
    @RequestMapping("/hello")
    public String hello(){
        return "<h1>Hello</h1 > Universe controller0";
    }

}

