package com.bubuwork.jf.om.bean;

import java.util.List;

import com.bubuwork.jf.om.entity.view.MaintainOrderVO;

public class MaintainOrderSearchResult {
  
  private List<MaintainOrderVO> orders;
  
  private long count;

  /**
   * @return the orders
   */
  public List<MaintainOrderVO> getOrders() {
    return orders;
  }

  /**
   * @return the count
   */
  public long getCount() {
    return count;
  }

  /**
   * @param orders the orders to set
   */
  public void setOrders(List<MaintainOrderVO> orders) {
    this.orders = orders;
  }

  /**
   * @param count the count to set
   */
  public void setCount(long count) {
    this.count = count;
  }
}
