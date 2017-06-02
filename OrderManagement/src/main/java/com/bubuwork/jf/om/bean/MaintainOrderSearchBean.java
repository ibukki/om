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
  
  private String mobile;
  
  private String licenseNumber;
  
  private String createBy;
  
  private int pageNum = 1;
  
  private int pageSize = 10;

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
   * @param createBy the createBy to set
   */
  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }

  /**
   * @return the mobile
   */
  public String getMobile() {
    return mobile;
  }

  /**
   * @return the licenseNumber
   */
  public String getLicenseNumber() {
    return licenseNumber;
  }

  /**
   * @param mobile the mobile to set
   */
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  /**
   * @param licenseNumber the licenseNumber to set
   */
  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  /**
   * @return the pageNum
   */
  public int getPageNum() {
    return pageNum;
  }

  /**
   * @return the pageSize
   */
  public int getPageSize() {
    return pageSize;
  }

  /**
   * @param pageNum the pageNum to set
   */
  public void setPageNum(int pageNum) {
    this.pageNum = pageNum;
  }

  /**
   * @param pageSize the pageSize to set
   */
  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }


  
  
}
