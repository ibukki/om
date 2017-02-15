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

/**
 * sales order
 * @author i065831
 *
 */
@Entity(name="SALES_ORDER")
@Table
public class Order {
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="ID")
  private Long id;
  
  @Column(name="TITLE", length=200)
  private String title;
  
  @Column(name="CREATE_BY", length=100)
  private String createBy;
  
  @Temporal(TemporalType.DATE)
  @Column(name = "CREATE_AT")
  private Date createAt;

  @Temporal(TemporalType.DATE)
  @Column(name = "LAST_MODIFY")
  private Date lastModify;
  
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
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * @param title the title to set
   */
  public void setTitle(String title) {
    this.title = title;
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
}
