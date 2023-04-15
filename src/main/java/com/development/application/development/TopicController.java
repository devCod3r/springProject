package com.development.application.development;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;
    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @RequestMapping("/topics")
    public List<Topic> getTopics(){
        return topicService.getTopics();
    }

}
