package com.example.first_spring_proj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController1 {
    @RequestMapping("/hello")
    public String hello(){
        return "controller1";
    }

}
