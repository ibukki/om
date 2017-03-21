package com.bubuwork.jf.om.entity.view;

import java.io.Serializable;
import java.util.List;

import com.bubuwork.jf.om.entity.GenericOrderItem;
import com.bubuwork.jf.om.entity.MaintainOrder;

public class MaintainOrderVO implements Serializable{
  
  /**
   * serialVersionUID
   */
  private static final long serialVersionUID = 1L;
  
  private MaintainOrder order;
 
  private List<GenericOrderItem> items;


  /**
   * @return the items
   */
  public List<GenericOrderItem> getItems() {
    return items;
  }


  /**
   * @param items the items to set
   */
  public void setItems(List<GenericOrderItem> items) {
    this.items = items;
  }


  /**
   * @return the order
   */
  public MaintainOrder getOrder() {
    return order;
  }


  /**
   * @param order the order to set
   */
  public void setOrder(MaintainOrder order) {
    this.order = order;
  }
  
}
