package com.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    

    //GET
    //URI - /hello-world
    //method = "Hello World"
    @GetMapping(path = "/hello-world")
    public String helloWorld()
    {
        return "Hello, World";
    }

}