package com.eventflow.model;

import lombok.Data;

import java.util.Map;

@Data
public class Message {
    private String id;
    private String topic;
    private String key;
    private String value;
    private Long timeStamp;
    private Map<String, String> headers;
}
