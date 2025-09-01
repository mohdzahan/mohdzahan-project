package com.wecp.progressive.service.impl;

import com.wecp.progressive.dao.SupplierDAO;
import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

import java.util.List;

public class SupplierServiceImplJdbc implements SupplierService {

    private SupplierDAO supplierDAO;

    public SupplierServiceImplJdbc(SupplierDAO supplierDAO) {
        this.supplierDAO = supplierDAO;
    }

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
    public void updateSupplier(Supplier supplier) {
    }

    @Override
    public void deleteSupplier(int supplierId) {

    }

    @Override
    public Supplier getSupplierById(int supplierId) {
        return null;
    }
}
