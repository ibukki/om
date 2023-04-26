package com.bubuwork.jf.om.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity(name="GENERIC_ORDER_ITEM")
@Table
@Data
public class GenericOrderItem {
  
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  @Column(name="ID")
  private Long id;
  
  @Column(name="ORDER_ID")
  private Long orderId;
  
  @Column(name="DESCRIPTION")
  private String description;
  
  @Column(name="UNIT")
  private int unit;
  
  @Column(name="PRICE")
  private double price;


}
