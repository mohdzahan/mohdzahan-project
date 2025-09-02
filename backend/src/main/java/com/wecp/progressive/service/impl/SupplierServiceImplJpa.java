package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.repository.SupplierRepository;
import com.wecp.progressive.service.SupplierService;

@Service
public class SupplierServiceImplJpa  implements SupplierService{

    @Autowired
    private SupplierRepository supplierRepository;

    


    public SupplierServiceImplJpa(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public int addSupplier(Supplier supplier) throws SQLException {
        supplierRepository.save(supplier);
        return supplier.getSupplierId();
    }

    @Override
    public void deleteSupplier(int supplierId) throws SQLException {
        Supplier sup = supplierRepository.findById(supplierId).orElse(null);
        if(sup != null){
            supplierRepository.delete(sup);
        }
    }

    @Override
    public List<Supplier> getAllSuppliers() throws SQLException {
       return supplierRepository.findAll();
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() throws SQLException {
        List<Supplier> suppliers = supplierRepository.findAll();
        List<Supplier> sortedList = new ArrayList<>(suppliers);
        Collections.sort(sortedList);
        return sortedList;
    }

    @Override
    public Supplier getSupplierById(int supplierId) throws SQLException {
       return supplierRepository.findById(supplierId).orElse(null);
    }

    @Override
    public void updateSupplier(Supplier supplier) throws SQLException {
        Supplier s = supplierRepository.findById(supplier.getSupplierId()).orElse(null);
        if(s != null){
            s.setAddress(supplier.getAddress());
            s.setEmail(supplier.getEmail());
            s.setPassword(supplier.getPassword());
            s.setPhone((supplier.getPhone()));
            s.setRole(supplier.getRole());
            s.setSupplierName(supplier.getSupplierName());
            s.setUsername(supplier.getUsername());
            supplierRepository.save(s);
        }
    }

    
    
}
