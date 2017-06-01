package com.bubuwork.jf.om.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Car")
@Table
public class Car {
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="ID")
  private Long id;
  
  @Column(name="CAR_MODEL")
  public String carModel;
  
  @Column(name="LICENSE_NUMBER")
  public String licenseNumber;
  
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
