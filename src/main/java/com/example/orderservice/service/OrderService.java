package com.example.orderservice.service;

import com.example.orderservice.dto.OrderDto;
import com.example.orderservice.jpa.OrderEntity;
import org.springframework.stereotype.Service;

public interface OrderService {

    // 구현할 서비스

    // 주문 생성
    OrderDto createOrder(OrderDto orderDto);

    // 주문 번호로 주문 내역 조회
    OrderDto getOrderByOrderId(String orderId);

    // 사용자 Id로 전체 주문 내역 조회
    Iterable<OrderEntity> getOrdersByUserId(String userId);
}
