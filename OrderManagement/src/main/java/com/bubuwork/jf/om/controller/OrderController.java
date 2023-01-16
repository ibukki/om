package com.bubuwork.jf.om.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bubuwork.jf.om.entity.SalesOrder;
import com.bubuwork.jf.om.service.OrderService;

@Controller
@RequestMapping("order")
public class OrderController {
  
  @Autowired
  private OrderService orderService;
  
  @RequestMapping("list")
  public @ResponseBody List<SalesOrder> listOrder(){
    return orderService.listOrders();
  }
  
}
