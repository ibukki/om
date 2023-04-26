package com.bubuwork.jf.om.entity;


import jakarta.persistence.*;

@Entity(name="Car")
@Table
public class Car {
  
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  @Column(name="ID")
  private Long id;
  
  @Column(name="CAR_MODEL")
  public String carModel;
  
  /**
   * 车牌
   */
  @Column(name="LICENSE_NUMBER", unique=true)
  public String licenseNumber;
  
  /**
   * 行驶证
   */
  @Column(name="VEHICLE_NUMBER")
  public String vehicleNumber;

  /**
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * @return the carModel
   */
  public String getCarModel() {
    return carModel;
  }

  /**
   * @return the licenseNumber
   */
  public String getLicenseNumber() {
    return licenseNumber;
  }

  /**
   * @return the vehicleNumber
   */
  public String getVehicleNumber() {
    return vehicleNumber;
  }

  /**
   * @param id the id to set
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @param carModel the carModel to set
   */
  public void setCarModel(String carModel) {
    this.carModel = carModel;
  }

  /**
   * @param licenseNumber the licenseNumber to set
   */
  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  /**
   * @param vehicleNumber the vehicleNumber to set
   */
  public void setVehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }
  
}
