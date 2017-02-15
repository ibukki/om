package com.bubuwork.jf.om.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="SALES_ORDER_ITEM")
@Table
public class OrderItem {
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="ID")
  private Long id;
  
  @ManyToOne(cascade=CascadeType.DETACH)
  @JoinColumn(name="ORDER_ID", referencedColumnName="ID")
  private Order order;
  
  @Column(name="UNIT")
  private int unit;
  
  @Column(name="PRICE")
  private double price;
  
  /**
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @return the order
   */
  public Order getOrder() {
    return order;
  }

  /**
   * @param order the order to set
   */
  public void setOrder(Order order) {
    this.order = order;
  }

  /**
   * @return the unit
   */
  public int getUnit() {
    return unit;
  }

  /**
   * @param unit the unit to set
   */
  public void setUnit(int unit) {
    this.unit = unit;
  }

  /**
   * @return the price
   */
  public double getPrice() {
    return price;
  }

  /**
   * @param price the price to set
   */
  public void setPrice(double price) {
    this.price = price;
  }
  
}
