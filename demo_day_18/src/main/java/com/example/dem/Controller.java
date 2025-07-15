package com.example.dem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/hello")
    public String hello(){
        return "Hello Aziz !";
    }

    @GetMapping("/name")
    public String name(){
        return "My name is Abdulaziz Alharbi";
    }

    @GetMapping("/age")
    public String age(){

        return "My age is 30";
    }

    @GetMapping("/check/status")
    public String req(){

        return "Everything OK";
    }

    @GetMapping("/health")
    public String health(){

        return "Server health is up and running";
    }

    @GetMapping("/names")
    public String[] rist(){
        String names[] = {"Aziz", "Mohammed"};

        return names;
    }


}
