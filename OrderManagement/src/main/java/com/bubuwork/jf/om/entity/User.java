package com.bubuwork.jf.om.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * sales order
 * @author i065831
 *
 */
@Entity(name="User")
@Table
@Data
public class User {
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="ID")
  private Long id;
  
  @Column(name="USER_NAME")
  private String userName;
  
  @Column(name="EMAIL")
  private String email;
  
  @Column(name="MOBILE", unique=true)
  private String mobile;
  
  @Column(name="IDCARD", unique=true)
  private String IDCard;

  @Column(name="PASS")
  private String pass;

  @Temporal(TemporalType.DATE)
  @Column(name="CREATE_AT")
  private Date createAt;
}
