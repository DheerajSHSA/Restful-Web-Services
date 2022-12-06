package com.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {
    

    //GET
    //URI - /hello-world
    //method = "Hello World"
    @GetMapping(path = "/hello-world")
    public String helloWorld()
    {
        return "Hello, World";
    }
    
    //hello-world-bean
    @GetMapping(path = "/hello-world-bean")
    public helloWorldBean helloWorldBean()
    {
        // throw new RuntimeException("Some Error has Happened");
        return new helloWorldBean("Hello World");
    }

    //hello-world-bean
    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public helloWorldBean helloWorldPathVariable(@PathVariable String name)
    {
        return new helloWorldBean(String.format("Hello World , %s", name));
    }
}
