package com.example.orderservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder // 생성자, setter 없이 필드 값을 직관적으로 생성가능
public class Payload {
    // DB column 내용
    private String order_id;
    private String user_id;
    private String product_id;
    private int qty;
    private int unit_price;
    private int total_price;
}
