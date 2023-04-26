package com.bubuwork.jf.om.service;

import com.bubuwork.jf.om.dao.SupplierRepository;
import com.bubuwork.jf.om.entity.Supplier;
import com.bubuwork.jf.om.view.SupplierVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public SupplierVO saveSupplier(SupplierVO supplierVO){
        Supplier supplier = new Supplier();
        BeanUtils.copyProperties(supplierVO,supplier);
        supplier.setLastModify(new Date());

        supplier = supplierRepository.save(supplier);
        supplierVO.setId(supplier.getId());
        return supplierVO;
    }
}
