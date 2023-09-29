package com.achu.springboot.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FunRestController {
    // explose "/"" that return "Hello World"

    @GetMapping("/")
    public String SayHello() {
        return "Hello World222";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    // injected from application properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

}
