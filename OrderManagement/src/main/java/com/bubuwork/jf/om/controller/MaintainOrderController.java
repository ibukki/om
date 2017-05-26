package com.bubuwork.jf.om.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bubuwork.jf.om.bean.MaintainOrderSearchBean;
import com.bubuwork.jf.om.bean.MaintainOrderSearchResult;
import com.bubuwork.jf.om.bean.MaintainOrderSpecs;
import com.bubuwork.jf.om.dao.MaintainOrderRepository;
import com.bubuwork.jf.om.entity.MaintainOrder;
import com.bubuwork.jf.om.entity.view.MaintainOrderVO;

@Controller
@RequestMapping("morder")
public class MaintainOrderController {
  
  @Autowired
  private MaintainOrderRepository mOrderRepo;
  
  @RequestMapping(value="search", method=RequestMethod.POST,consumes="application/json")
  public @ResponseBody MaintainOrderSearchResult findMaintainOrders(@RequestBody MaintainOrderSearchBean searchBean){
    MaintainOrderSearchResult searchResult = new MaintainOrderSearchResult();
    List<MaintainOrderVO> mOrderList = new ArrayList<MaintainOrderVO>();
    
    List<MaintainOrder> dbOrderList = mOrderRepo.findAll(Specifications.where(MaintainOrderSpecs.hasPhone(searchBean.getPhone())).and(MaintainOrderSpecs.hasMaintainTypes(searchBean.getOrderType())));
    
    if(dbOrderList != null && !dbOrderList.isEmpty()){
      for (MaintainOrder maintainOrder : dbOrderList) {
        MaintainOrderVO orderVO = new MaintainOrderVO();
        orderVO.setOrder(maintainOrder);
        mOrderList.add(orderVO);
      }
    }
    
    searchResult.setOrders(mOrderList);
    return searchResult;
  }
}
