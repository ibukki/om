package com.bubuwork.jf.om.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bubuwork.jf.om.bean.MaintainOrderSearchBean;
import com.bubuwork.jf.om.bean.MaintainOrderSearchResult;
import com.bubuwork.jf.om.view.MaintainOrderVO;
import com.bubuwork.jf.om.service.MaintainOrderService;

@Controller
@RequestMapping("morder")
public class MaintainOrderController {
  
  @Autowired
  private MaintainOrderService mOrderService;
  
  @RequestMapping(value="search", method=RequestMethod.POST,consumes="application/json")
  public @ResponseBody MaintainOrderSearchResult findMaintainOrders(@RequestBody MaintainOrderSearchBean searchBean){
    return mOrderService.findAll(searchBean);
  }
  
  
  @RequestMapping(value="save", method=RequestMethod.POST,consumes="application/json")
  public @ResponseBody MaintainOrderVO saveOrder(@RequestBody MaintainOrderVO orderVO){
    return mOrderService.saveOrder(orderVO);
  }
}
