package com.bubuwork.jf.om.entity;


import jakarta.persistence.*;

@Entity(name="ATTACHMENT")
@Table
public class Attachment {
  
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  @Column(name="ID")
  private Long id;
  
  @Column(name="NAME", length=100)
  private String name;
  
  @Column(name="SHORT_DESCR", length=500)
  private String shortDescr;
  
  @Column(name="CONTENT")
  @Lob
  private byte[] content;
  
  @Column(name="CREATE_BY", length=100)
  private String createBy;

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
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the shortDescr
   */
  public String getShortDescr() {
    return shortDescr;
  }

  /**
   * @param shortDescr the shortDescr to set
   */
  public void setShortDescr(String shortDescr) {
    this.shortDescr = shortDescr;
  }

  /**
   * @return the content
   */
  public byte[] getContent() {
    return content;
  }

  /**
   * @param content the content to set
   */
  public void setContent(byte[] content) {
    this.content = content;
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
  
  
}
