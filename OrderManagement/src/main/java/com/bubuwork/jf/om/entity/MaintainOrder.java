package com.bubuwork.jf.om.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Entity(name="MAINTAIN_ORDER")
@Table
@Data
public class MaintainOrder {
  
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  @Column(name="ID")
  private Long id;
  
  @Column(name="LICENSE_NUMBER")
  private String licenseNumber;
  
  @Column(name="MILEAGE")
  private String mileage;

  @Column(name="MAINTAIN_TYPE", length=50)
  private String maintainType;
  
  @Column(name="MOBILE")
  private String mobile;
  
  @Column(name="ISVIP")
  private Boolean isVip;
  
  @Temporal(TemporalType.DATE)
  @Column(name="INSHOP_DATE")
  private Date inshopDate;
  
  @Temporal(TemporalType.DATE)
  @Column(name="CHECKOUT_DATE")
  private Date checkoutDate;
  
  @Column(name="TOTAL_AMOUNT")
  private Double totalAmount;
  
  @Column(name="CREATE_BY", length=100)
  private String createBy;
  
  @Temporal(TemporalType.DATE)
  @Column(name = "CREATE_AT")
  private Date createAt;

  @Temporal(TemporalType.DATE)
  @Column(name = "LAST_MODIFY")
  private Date lastModify;
  
  @Column(name="COMMENT", length=2000)
  private String comment;

}
