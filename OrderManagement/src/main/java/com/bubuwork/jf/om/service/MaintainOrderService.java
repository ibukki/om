package com.bubuwork.jf.om.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bubuwork.jf.om.dao.GenericOrderItemRepository;
import com.bubuwork.jf.om.dao.MaintainOrderRepository;
import com.bubuwork.jf.om.entity.MaintainOrder;

@Service
public class MaintainOrderService {
  
  @Autowired
  private MaintainOrderRepository mOrderRepo;
  
  @Autowired
  private GenericOrderItemRepository gOrderItemRepo;
  
  public MaintainOrder saveOrder(){
    
  }
  
}
