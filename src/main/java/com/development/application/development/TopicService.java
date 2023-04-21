package com.development.application.development;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("Spring", "Mark", "26 Jan"),
            new Topic("Java", "John", "4 Feb"),
            new Topic("JS", "Jim", "22 Mar"));

    public List<Topic> getTopics() {
        return topics;
    }

}