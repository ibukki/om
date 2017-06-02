package com.bubuwork.jf.om.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * sales order
 * @author i065831
 *
 */
@Entity(name="User")
@Table
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

  /**
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * @return the userName
   */
  public String getUserName() {
    return userName;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @return the mobile
   */
  public String getMobile() {
    return mobile;
  }

  /**
   * @param id the id to set
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @param userName the userName to set
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @param mobile the mobile to set
   */
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  /**
   * @return the iDCard
   */
  public String getIDCard() {
    return IDCard;
  }

  /**
   * @param iDCard the iDCard to set
   */
  public void setIDCard(String iDCard) {
    IDCard = iDCard;
  }
}
