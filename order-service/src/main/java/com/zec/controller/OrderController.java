package com.zec.controller;

import com.zec.entity.Order;
import com.zec.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zec.service.OrderService;

import java.util.List;

@RestController
@RequestMapping ("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/product/{productId}")
    public Product  getProduct(@PathVariable Long productId) {
        return orderService.getProductDetails(productId);
    }

    @PostMapping
    public Order createOrder(@RequestBody  Order order) {
        return orderService.createOrder(order);
    }

    @GetMapping
    public List <Order> getAllOrders() {
        System.out.println(orderService.getAllOrders());

        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable Long id, @RequestBody Order orderDetails) {
        return orderService.updateOrder(id, orderDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
    }
}

