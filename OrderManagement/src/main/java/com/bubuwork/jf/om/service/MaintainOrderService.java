package com.bubuwork.jf.om.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bubuwork.jf.om.bean.MaintainOrderSearchBean;
import com.bubuwork.jf.om.bean.MaintainOrderSearchResult;
import com.bubuwork.jf.om.dao.GenericOrderItemRepository;
import com.bubuwork.jf.om.dao.MaintainOrderRepository;
import com.bubuwork.jf.om.entity.GenericOrderItem;
import com.bubuwork.jf.om.entity.MaintainOrder;
import com.bubuwork.jf.om.entity.view.MaintainOrderVO;

@Service
public class MaintainOrderService {
  
  @Autowired
  private MaintainOrderRepository mOrderRepo;
  
  @Autowired
  private GenericOrderItemRepository gOrderItemRepo;
  
  @Transactional
  public MaintainOrderVO saveOrder(MaintainOrderVO orderVO){
    MaintainOrder order = orderVO.getOrder();
    order = mOrderRepo.save(order);
    orderVO.setOrder(order);
    
    List<GenericOrderItem> uiItems = orderVO.getItems();
    for (GenericOrderItem guiItem : uiItems) {
      guiItem.setOrderId(order.getId());
    }
    
    //remove the existing item totally
    if(order.getId() == null){
      List<GenericOrderItem> dbItems = gOrderItemRepo.findByOrderId(order.getId());
      gOrderItemRepo.deleteInBatch(dbItems);
    }
    
    gOrderItemRepo.save(uiItems);
    orderVO.setItems(uiItems);
    
    return orderVO;
  }
  
  @Transactional
  public void deleteOrder(Long orderId){
    List<GenericOrderItem> dbItems = gOrderItemRepo.findByOrderId(orderId);
    
    mOrderRepo.delete(orderId);
    gOrderItemRepo.deleteInBatch(dbItems);
    
  }
  
}
