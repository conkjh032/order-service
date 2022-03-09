package com.example.orderservice.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder // 생성자, setter 없이 필드 값을 직관적으로 생성가능 -> OrderProducer에서 확인 가능
public class Schema {
    private String type;
    private List<Field> fields;
    private boolean optional;
    private String name;
}
