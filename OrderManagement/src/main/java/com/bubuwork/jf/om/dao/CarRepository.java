package com.bubuwork.jf.om.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bubuwork.jf.om.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{
  public Car findByLicenseNumber(String licenseNumber);
}
