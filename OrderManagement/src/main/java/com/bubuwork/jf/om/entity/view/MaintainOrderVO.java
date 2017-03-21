package com.bubuwork.jf.om.entity.view;

import java.io.Serializable;
import java.util.List;

import com.bubuwork.jf.om.entity.GenericOrderItem;
import com.bubuwork.jf.om.entity.MaintainOrder;

public class MaintainOrderVO extends MaintainOrder implements Serializable{
  
  /**
   * serialVersionUID
   */
  private static final long serialVersionUID = 1L;
  
 
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
  
}
