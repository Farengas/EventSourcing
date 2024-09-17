package com.javatechie.dto.enums;

import lombok.ToString;

@ToString
public enum OrderStatus {
    CREATED,
    CONFIRMED,
    SHIPPED,
    DELIVERED;
}
