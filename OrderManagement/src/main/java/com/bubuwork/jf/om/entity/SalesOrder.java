package com.bubuwork.jf.om.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;


/**
 * sales order
 * @author i065831
 *
 */
@Entity(name="SALES_ORDER")
@Table
@Data
public class SalesOrder {
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="ID")
  private Long id;
  
  @Column(name="TITLE", length=200)
  private String title;
  
  @Column(name="CREATE_BY", length=100)
  private String createBy;
  
  @Column(name="CHANGE_BY", length=100)
  private String changeBy;
  
  @Temporal(TemporalType.DATE)
  @Column(name = "CREATE_AT")
  private Date createAt;

  @Temporal(TemporalType.DATE)
  @Column(name = "LAST_MODIFY")
  private Date lastModify;

  @Column(name="SUPPLIER_ID")
  private Long supplierId;

  @Column(name="TAX_RETURN")
  private Double taxReturn;

  @OneToMany(cascade=CascadeType.ALL, mappedBy="order", fetch=FetchType.LAZY)
  private List<OrderItem> items;
  
  @Column(name="COMMENT", length=2000)
  private String comment;

}
