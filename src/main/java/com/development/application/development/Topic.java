package com.development.application.development;

public class Topic {

    private String topicname;
    private String topicauthor;
    private String topicdate;

    public Topic() {
    }

    public Topic(String topicname, String topicauthor, String topicdate) {
        this.topicname = topicname;
        this.topicauthor = topicauthor;
        this.topicdate = topicdate;
    }
    public String getTopicname() {
        return topicname;
    }

    public void setTopicname(String topicname) {
        this.topicname = topicname;
    }

    public String getTopicauthor() {
        return topicauthor;
    }

    public void setTopicauthor(String topicauthor) {
        this.topicauthor = topicauthor;
    }

    public String getTopicdate() {
        return topicdate;
    }

    public void setTopicdate(String topicdate) {
        this.topicdate = topicdate;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "topicname='" + topicname + '\'' +
                ", topicauthor='" + topicauthor + '\'' +
                ", topicdate='" + topicdate + '\'' +
                '}';
    }
}
