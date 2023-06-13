package com.bubuwork.jf.om.service;

import com.bubuwork.jf.om.dao.SupplierRepository;
import com.bubuwork.jf.om.entity.Supplier;
import com.bubuwork.jf.om.view.SupplierVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public SupplierVO saveSupplier(SupplierVO supplierVO){
        Supplier supplier = new Supplier();
        BeanUtils.copyProperties(supplierVO,supplier);
        supplier.setLastModify(new Date());
        supplier.setCreateAt(new Date());

        supplier = supplierRepository.save(supplier);
        supplierVO.setId(supplier.getId());
        return supplierVO;
    }

    public List<SupplierVO> listSuppliers(){

        List<SupplierVO> voList = new ArrayList<>();
        List<Supplier> suppliers = supplierRepository.findAll();
        if(suppliers.size() > 0){
            for (Supplier sup: suppliers) {
                SupplierVO suppVO = new SupplierVO();
                BeanUtils.copyProperties(sup, suppVO);
                voList.add(suppVO);
            }
        }
        return voList;
    }
}
