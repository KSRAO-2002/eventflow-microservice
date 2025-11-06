package com.eventflow.model;

import lombok.Data;

import java.util.Queue;

@Data
public class Topic {
    private String name;
    private Queue<Message> messages;
    private Long createdAt;
    private int retentionHours;
}
