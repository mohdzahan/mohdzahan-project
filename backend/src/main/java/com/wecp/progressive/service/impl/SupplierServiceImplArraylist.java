package com.wecp.progressive.service.impl;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

import java.util.List;

public class SupplierServiceImplArraylist implements SupplierService {

    @Override
    public List<Supplier> getAllSuppliers() {
        return List.of();
    }

    @Override
    public int addSupplier(Supplier supplier) {
        return -1;
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
        return List.of();
    }

    @Override
    public void emptyArrayList() {
        SupplierService.super.emptyArrayList();
    }
}
