package com.bubuwork.jf.om.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="MAINTAIN_ORDER")
@Table
public class MaintainOrder {
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="ID")
  private Long id;
  
  @Column(name="CAR_MODEL")
  private String carModel;
  
  @Column(name="LICENSE_NUMBER")
  private String licenseNumber;
  
  @Column(name="MILEAGE")
  private String mileage;
  
  @Column(name="OWNER")
  private String owner;
  
  @Column(name="PHONE")
  private String phone;
  
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
   * @return the carModel
   */
  public String getCarModel() {
    return carModel;
  }

  /**
   * @param carModel the carModel to set
   */
  public void setCarModel(String carModel) {
    this.carModel = carModel;
  }

  /**
   * @return the licenseNumber
   */
  public String getLicenseNumber() {
    return licenseNumber;
  }

  /**
   * @param licenseNumber the licenseNumber to set
   */
  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  /**
   * @return the mileage
   */
  public String getMileage() {
    return mileage;
  }

  /**
   * @param mileage the mileage to set
   */
  public void setMileage(String mileage) {
    this.mileage = mileage;
  }

  /**
   * @return the owner
   */
  public String getOwner() {
    return owner;
  }

  /**
   * @param owner the owner to set
   */
  public void setOwner(String owner) {
    this.owner = owner;
  }

  /**
   * @return the phone
   */
  public String getPhone() {
    return phone;
  }

  /**
   * @param phone the phone to set
   */
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * @return the isVip
   */
  public Boolean getIsVip() {
    return isVip;
  }

  /**
   * @param isVip the isVip to set
   */
  public void setIsVip(Boolean isVip) {
    this.isVip = isVip;
  }

  /**
   * @return the inshopDate
   */
  public Date getInshopDate() {
    return inshopDate;
  }

  /**
   * @param inshopDate the inshopDate to set
   */
  public void setInshopDate(Date inshopDate) {
    this.inshopDate = inshopDate;
  }

  /**
   * @return the checkoutDate
   */
  public Date getCheckoutDate() {
    return checkoutDate;
  }

  /**
   * @param checkoutDate the checkoutDate to set
   */
  public void setCheckoutDate(Date checkoutDate) {
    this.checkoutDate = checkoutDate;
  }

  /**
   * @return the totalAmount
   */
  public Double getTotalAmount() {
    return totalAmount;
  }

  /**
   * @param totalAmount the totalAmount to set
   */
  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  /**
   * @return the createBy
   */
  public String getCreateBy() {
    return createBy;
  }

  /**
   * @param createBy the createBy to set
   */
  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }

  /**
   * @return the createAt
   */
  public Date getCreateAt() {
    return createAt;
  }

  /**
   * @param createAt the createAt to set
   */
  public void setCreateAt(Date createAt) {
    this.createAt = createAt;
  }

  /**
   * @return the lastModify
   */
  public Date getLastModify() {
    return lastModify;
  }

  /**
   * @param lastModify the lastModify to set
   */
  public void setLastModify(Date lastModify) {
    this.lastModify = lastModify;
  }

  /**
   * @return the comment
   */
  public String getComment() {
    return comment;
  }

  /**
   * @param comment the comment to set
   */
  public void setComment(String comment) {
    this.comment = comment;
  }
  
}
