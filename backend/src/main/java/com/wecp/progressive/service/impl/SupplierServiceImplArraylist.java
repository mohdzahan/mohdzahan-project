package com.wecp.progressive.service.impl;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

@Service
public class SupplierServiceImplArraylist  implements SupplierService{


    private static List<Supplier> suppliers = new ArrayList<>();

    @Override
    public int addSupplier(Supplier supplier) {

        suppliers.add(supplier);
        return suppliers.size();
    }

    @Override
    public List<Supplier> getAllSuppliers() {

        return suppliers;
    }
    @Override
    public List<Supplier> getAllSuppliersSortedByName() {

        List<Supplier> supplierSort = new ArrayList<>(suppliers);
        Collections.sort(supplierSort);
        return supplierSort;
    }
    @Override
    public void emptyArrayList() {

        suppliers = new ArrayList<>();

    }

}
