package com.bubuwork.jf.om.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;

import com.bubuwork.jf.om.bean.MaintainOrderSearchBean;
import com.bubuwork.jf.om.bean.MaintainOrderSearchResult;
import com.bubuwork.jf.om.bean.MaintainOrderSpecs;
import com.bubuwork.jf.om.dao.CarRepository;
import com.bubuwork.jf.om.dao.GenericOrderItemRepository;
import com.bubuwork.jf.om.dao.MaintainOrderRepository;
import com.bubuwork.jf.om.dao.UserRepository;
import com.bubuwork.jf.om.entity.Car;
import com.bubuwork.jf.om.entity.GenericOrderItem;
import com.bubuwork.jf.om.entity.MaintainOrder;
import com.bubuwork.jf.om.entity.User;
import com.bubuwork.jf.om.entity.view.MaintainOrderVO;

@Service
public class MaintainOrderService {

  @Autowired
  private MaintainOrderRepository mOrderRepo;
  
  @Autowired
  private CarRepository carRepo;
  
  @Autowired
  private UserRepository userRepo;

  @Autowired
  private GenericOrderItemRepository gOrderItemRepo;

  @Transactional
  public MaintainOrderVO saveOrder(MaintainOrderVO orderVO) {
    MaintainOrder order = orderVO.getOrder();
    order.setLastModify(new Date());
    if (order.getId() == null) {
      order.setCreateAt(new Date());
    }
    order = mOrderRepo.save(order);
    orderVO.setOrder(order);
    
    //check car 
    if(orderVO.getCar() != null && !StringUtils.isEmpty(orderVO.getCar().getLicenseNumber())){
      Car dbCar = carRepo.findByLicenseNumber(orderVO.getCar().getLicenseNumber());
      if(dbCar == null){
        Car car = orderVO.getCar();
        carRepo.save(car);
      }
    }
    
    //check user
    if(orderVO.getUser() != null && !StringUtils.isEmpty(orderVO.getUser().getMobile())){
      User dbuser = userRepo.findByMobile(orderVO.getUser().getMobile());
      if(dbuser == null){
        User user = orderVO.getUser();
        userRepo.save(user);
      }
    }

    List<GenericOrderItem> uiItems = orderVO.getItems();
    if(uiItems != null && !uiItems.isEmpty()){
      for (GenericOrderItem guiItem : uiItems) {
        guiItem.setOrderId(order.getId());
      }
    }

    // remove the existing item totally
    if (order.getId() == null) {
      List<GenericOrderItem> dbItems = gOrderItemRepo.findByOrderId(order.getId());
      gOrderItemRepo.deleteInBatch(dbItems);
    }

    gOrderItemRepo.save(uiItems);
    orderVO.setItems(uiItems);

    return orderVO;
  }

  @Transactional
  public void deleteOrder(Long orderId) {
    List<GenericOrderItem> dbItems = gOrderItemRepo.findByOrderId(orderId);

    mOrderRepo.delete(orderId);
    gOrderItemRepo.deleteInBatch(dbItems);

  }
  
  /**
   * 
   * @param searchBean
   * @return
   */
  public MaintainOrderSearchResult findAll(MaintainOrderSearchBean searchBean) {
    
    MaintainOrderSearchResult searchResult = new MaintainOrderSearchResult();
    List<MaintainOrderVO> mOrderList = new ArrayList<MaintainOrderVO>();
    
    Pageable pageRequest = null;
    if(searchBean.getPageNum() <=0){
      searchBean.setPageNum(0);
    }
    if(searchBean.getPageSize() <=0){
      searchBean.setPageSize(20);
    }
    pageRequest = new PageRequest(searchBean.getPageNum(), searchBean.getPageSize());
    Page<MaintainOrder> dbOrderPage = mOrderRepo
        .findAll(Specifications.where(MaintainOrderSpecs.hasPhone(searchBean.getMobile()))
            .and(MaintainOrderSpecs.hasMaintainTypes(searchBean.getOrderType())), pageRequest);
    
    List<MaintainOrder> dbOrderList = dbOrderPage.getContent();
    if (dbOrderList != null && !dbOrderList.isEmpty()) {
      for (MaintainOrder maintainOrder : dbOrderList) {
        MaintainOrderVO orderVO = new MaintainOrderVO();
        orderVO.setOrder(maintainOrder);
        mOrderList.add(orderVO);
      }
    }

    searchResult.setOrders(mOrderList);
    searchResult.setCount(dbOrderPage.getTotalElements());
    searchResult.setPageSize(dbOrderPage.getTotalPages());
    return searchResult;
  }

}
