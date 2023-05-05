package com.bubuwork.jf.om.controller;

import com.bubuwork.jf.om.service.SupplierService;
import com.bubuwork.jf.om.view.SupplierVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("sav")
    public SupplierVO saveSupplier(@RequestBody SupplierVO supplierVO){
        return supplierService.saveSupplier(supplierVO);
    }
}
