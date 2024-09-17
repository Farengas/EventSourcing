package com.javatechie.entity;

import com.javatechie.dto.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name =  "order_events")
@Entity
public class OrderEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderId;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;  // CREATED, CONFIRMED
    private String details;
    private LocalDateTime eventTimestamp;

    public OrderEvent(String orderId, OrderStatus status, String details, LocalDateTime eventTimestamp) {
        this.orderId = orderId;
        this.status = status;
        this.details = details;
        this.eventTimestamp = eventTimestamp;
    }
}
