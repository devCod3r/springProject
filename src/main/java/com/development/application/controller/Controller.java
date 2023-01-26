package com.development.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @RequestMapping("/topics")
    public List<Topic> getTopics(){
        ArrayList<Topic> arr = new ArrayList<>();
        arr.add(new Topic("none","none","none"));
        arr.add(new Topic("none1","none1","none1"));
        arr.add(new Topic("none2","none2","none2"));
        return arr;
    }

}
