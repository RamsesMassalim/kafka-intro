package com.example.consumerfirst.service;

import com.example.consumerfirst.domain.Order;
import com.example.consumerfirst.service.dto.OrderDto;

public interface OrderService {
    Order save(OrderDto clientDto);
}
