package com.bubuwork.jf.om.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name="SALES_ORDER_ITEM")
@Table
@Data
public class OrderItem {
  
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  @Column(name="ID")
  private Long id;
  
  @ManyToOne(cascade=CascadeType.DETACH)
  @JoinColumn(name="ORDER_ID", referencedColumnName="ID")
  private SalesOrder order;

  @Column(name="ITEM_NAME")
  private String itemName;
  
  @Column(name="UNIT")
  private int unit;
  
  @Column(name="PRICE")
  private double price;
  
  @Column(name="CURRENCY")
  private String currency;
}
