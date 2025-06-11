package com.zec.service;

import com.zec.client.ProductClient;
import com.zec.entity.Order;
import com.zec.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zec.repository.OrderRepository;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private ProductClient productClient;

    public Product  getProductDetails(Long productId) {
        return productClient.getProductById(productId);
    }


    @Autowired
    private OrderRepository  orderRepository;

    public Order  createOrder(Order order) {
        return orderRepository.save(order);
    }

    public List <Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order updateOrder(Long id, Order orderDetails) {
        Order order = getOrderById(id);
        if (order != null) {
            order.setOrderDate(orderDetails.getOrderDate());
            order.setCustomerName(orderDetails.getCustomerName());
            return orderRepository.save(order);
        }
        return null;
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}

