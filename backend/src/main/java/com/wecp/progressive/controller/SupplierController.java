package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Supplier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SupplierController {

    public ResponseEntity<List<Supplier>> getAllSuppliers() {
        return null;
    }

    public ResponseEntity<Supplier> getSupplierById(int supplierId) {
        return null;
    }

    public ResponseEntity<Integer> addSupplier(Supplier supplier) {
        return null;
    }

    public ResponseEntity<Void> updateSupplier(int supplierId, Supplier supplier) {
        return null;
    }

    public ResponseEntity<Void> deleteSupplier(int supplierId) {
        return null;
    }

    public ResponseEntity<List<Supplier>> getAllSuppliersFromArrayList() {
        return null;
    }

    public ResponseEntity<Integer> addSupplierToArrayList(Supplier supplier) {
        return null;
    }

    public ResponseEntity<List<Supplier>> getAllSuppliersSortedByNameFromArrayList() {
        return null;
    }
}
