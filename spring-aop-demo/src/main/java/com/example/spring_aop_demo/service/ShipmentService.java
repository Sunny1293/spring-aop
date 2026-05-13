package com.example.spring_aop_demo.service;

public interface ShipmentService {

    String orderPackage(Long orderId);

    String trackPackage(Long orderId);
}
