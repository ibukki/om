package com.bubuwork.jf.om.bean;

import java.util.List;

import com.bubuwork.jf.om.view.MaintainOrderVO;

public class MaintainOrderSearchResult {
  
  private List<MaintainOrderVO> orders;
  
  private long count;
  
  private long pageSize;

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

  /**
   * @return the pageSize
   */
  public long getPageSize() {
    return pageSize;
  }

  /**
   * @param pageSize the pageSize to set
   */
  public void setPageSize(long pageSize) {
    this.pageSize = pageSize;
  }
}
