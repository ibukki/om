package com.bubuwork.jf.om.controller;

import com.bubuwork.jf.om.service.SupplierService;
import com.bubuwork.jf.om.view.SupplierVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("sav")
    public SupplierVO saveSupplier(@RequestBody SupplierVO supplierVO){
        return supplierService.saveSupplier(supplierVO);
    }

    @GetMapping("list")
    public List<SupplierVO> listSupplier(){
        return supplierService.listSuppliers();
    }
}
