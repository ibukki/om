package com.bubuwork.jf.om.view;

import java.io.Serializable;
import java.util.List;

import com.bubuwork.jf.om.entity.Car;
import com.bubuwork.jf.om.entity.GenericOrderItem;
import com.bubuwork.jf.om.entity.MaintainOrder;
import com.bubuwork.jf.om.entity.User;

public class MaintainOrderVO implements Serializable{
  
  /**
   * serialVersionUID
   */
  private static final long serialVersionUID = 1L;
  
  private MaintainOrder order;
  
  private Car car;
  
  private User user;
 
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


  /**
   * @return the car
   */
  public Car getCar() {
    return car;
  }


  /**
   * @return the user
   */
  public User getUser() {
    return user;
  }


  /**
   * @param car the car to set
   */
  public void setCar(Car car) {
    this.car = car;
  }


  /**
   * @param user the user to set
   */
  public void setUser(User user) {
    this.user = user;
  }
  
}
