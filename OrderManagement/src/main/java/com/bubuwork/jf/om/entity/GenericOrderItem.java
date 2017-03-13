package com.bubuwork.jf.om.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="GENERIC_ORDER_ITEM")
@Table
public class GenericOrderItem {
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="ID")
  private Long id;
  
  @Column(name="ORDER_ID")
  private Long orderId;
  
  @Column(name="DESCRIPTIOIN")
  private String description;
  
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
   * @return the orderId
   */
  public Long getOrderId() {
    return orderId;
  }

  /**
   * @param orderId the orderId to set
   */
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  /**
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * @param description the description to set
   */
  public void setDescription(String description) {
    this.description = description;
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
