package com.bubuwork.jf.om.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bubuwork.jf.om.entity.GenericOrderItem;

@Repository
public interface GenericOrderItemRepository extends JpaRepository<GenericOrderItem, Long>{
  
  public List<GenericOrderItem> findByOrderId(Long orderId);
}
