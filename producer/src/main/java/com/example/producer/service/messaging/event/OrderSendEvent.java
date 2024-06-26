package com.example.producer.service.messaging.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderSendEvent {
    private String productName;
    private String barCode;
    private int quantity;
    private BigDecimal price;
}
