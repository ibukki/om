package com.bubuwork.jf.om.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bubuwork.jf.om.dao.OrderRepository;
import com.bubuwork.jf.om.entity.SalesOrder;

@Service
public class OrderService {
  
  @Autowired
  private OrderRepository orderRepository;
  
  public List<SalesOrder> listOrders(){
    return orderRepository.findAll();
  }
}
