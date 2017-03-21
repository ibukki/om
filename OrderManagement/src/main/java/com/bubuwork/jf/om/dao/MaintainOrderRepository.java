package com.bubuwork.jf.om.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bubuwork.jf.om.entity.MaintainOrder;

@Repository
public interface MaintainOrderRepository extends JpaRepository<MaintainOrder, Long>{
  
}
