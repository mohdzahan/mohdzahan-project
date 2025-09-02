package com.wecp.progressive.service.impl;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Supplier;

import java.util.List;


import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;

@Service
public class WarehouseServiceImplArraylist  implements WarehouseService{


    private static List<Warehouse> warehouses = new ArrayList<>();

    @Override
    public int addWarehouse(Warehouse warehouse) {
        warehouses.add(warehouse);
        return warehouses.size();
    }
  

    @Override
    public void emptyArrayList() {
        warehouses = new ArrayList<>();
    }

    @Override
    public List<Warehouse> getAllWarehouses() {

        return warehouses;
    }


    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        List<Warehouse> sortedWareHouse = new ArrayList<>(warehouses);
        sortedWareHouse.sort(Comparator.comparing(Warehouse::getCapacity));
        return sortedWareHouse;

       
    }

    
    
}
