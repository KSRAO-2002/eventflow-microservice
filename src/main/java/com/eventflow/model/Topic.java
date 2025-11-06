package com.eventflow.model;

import lombok.Data;

import java.util.Queue;

@Data
public class Topic {
    private String topic;
    private Queue<Message> messages;
    private Long createdAt;
    private int retentionHours;
}
