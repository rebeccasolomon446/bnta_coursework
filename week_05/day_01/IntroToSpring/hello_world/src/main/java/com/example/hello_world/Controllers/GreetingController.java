package com.example.hello_world.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController  // new controller per model
public class GreetingController {

//	- controller to handle incoming request

// Get request
    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name") String name) {   // decising greeting end point will have a request param added to it. value = " name" will be the

        return "Hello " + name;
    }

}
