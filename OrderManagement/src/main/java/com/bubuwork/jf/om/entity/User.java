package com.bubuwork.jf.om.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

/**
 * sales order
 * @author i065831
 *
 */
@Entity(name="User")
@Table
@Data
public class User implements UserDetails {
  
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  @Column(name="ID")
  private Long id;
  
  @Column(name="USER_NAME")
  private String username;
  
  @Column(name="EMAIL")
  private String email;
  
  @Column(name="MOBILE", unique=true)
  private String mobile;
  
  @Column(name="IDCARD", unique=true)
  private String IDCard;

  @Column(name="PASS")
  private String password;

  @Temporal(TemporalType.DATE)
  @Column(name="CREATE_AT")
  private Date createAt;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return Set.of();
  }

  @Override
  public boolean isAccountNonExpired() {
    return false;
  }

  @Override
  public boolean isAccountNonLocked() {
    return false;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
