package com.bubuwork.jf.om.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bubuwork.jf.om.entity.SysUser;

@Repository
public interface UserRepository extends JpaRepository<SysUser, Integer>{
  public SysUser findByMobile(String mobile);

  public SysUser findByEmail(String email);

  SysUser findByUsername(String username);

}
