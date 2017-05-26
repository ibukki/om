package com.bubuwork.jf.om.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author rh
 *
 */
public class MaintainOrderSearchBean implements Serializable{
  
  /**
   * serialVersionUID
   */
  private static final long serialVersionUID = 5205541321419083054L;

  private List<MaintainTypeEnum> orderType;
  
  private Date createAtBegin;
  
  private Date createAtEnd;
  
  private String owner;
  
  private String phone;
  
  private String createBy;

  /**
   * @return the orderType
   */
  public List<MaintainTypeEnum> getOrderType() {
    return orderType;
  }

  /**
   * @return the createAtBegin
   */
  public Date getCreateAtBegin() {
    return createAtBegin;
  }

  /**
   * @return the createAtEnd
   */
  public Date getCreateAtEnd() {
    return createAtEnd;
  }

  /**
   * @return the owner
   */
  public String getOwner() {
    return owner;
  }

  /**
   * @return the phone
   */
  public String getPhone() {
    return phone;
  }

  /**
   * @return the createBy
   */
  public String getCreateBy() {
    return createBy;
  }

  /**
   * @param orderType the orderType to set
   */
  public void setOrderType(List<MaintainTypeEnum> orderType) {
    this.orderType = orderType;
  }

  /**
   * @param createAtBegin the createAtBegin to set
   */
  public void setCreateAtBegin(Date createAtBegin) {
    this.createAtBegin = createAtBegin;
  }

  /**
   * @param createAtEnd the createAtEnd to set
   */
  public void setCreateAtEnd(Date createAtEnd) {
    this.createAtEnd = createAtEnd;
  }

  /**
   * @param owner the owner to set
   */
  public void setOwner(String owner) {
    this.owner = owner;
  }

  /**
   * @param phone the phone to set
   */
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * @param createBy the createBy to set
   */
  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }
  
  
}
