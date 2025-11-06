package com.eventflow.model;

import lombok.Data;

@Data
public class Subscription {
    private String consumerId;
    private String consumerGroup;
    private String topic;
    private Long offset;
}
