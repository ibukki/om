package com.bubuwork.jf.om.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bubuwork.jf.om.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
  public User findByMobile(String mobile);
}
