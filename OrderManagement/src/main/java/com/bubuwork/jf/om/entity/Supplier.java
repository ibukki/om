package com.bubuwork.jf.om.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity(name="SUPPLIER")
@Table
@Data
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name="SUPPLIER_NAME")
    private String supplierName;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="COUNTRY")
    private String country;

    @Column(name="CONTACT")
    private String contact;

    @Column(name="PHONE1")
    private String phone1;

    @Column(name="PHONE2")
    private String phone2;

    @Column(name="ADDRESS1")
    private String address1;

    @Column(name="ADDRESS2")
    private String address2;

    @Column(name="ADDRESS3")
    private String address3;

    @Temporal(TemporalType.DATE)
    @Column(name = "CREATE_AT")
    private Date createAt;

    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_MODIFY")
    private Date lastModify;
}
