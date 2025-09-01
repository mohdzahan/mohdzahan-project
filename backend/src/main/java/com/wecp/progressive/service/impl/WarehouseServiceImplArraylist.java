package com.wecp.progressive.service.impl;

import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;

import java.util.List;

public class WarehouseServiceImplArraylist implements WarehouseService {

    @Override
    public List<Warehouse> getAllWarehouses() {
        return List.of();
    }

    @Override
    public int addWarehouse(Warehouse warehouse) {
        return -1;
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        return List.of();
    }

    @Override
    public void emptyArrayList() {
        WarehouseService.super.emptyArrayList();
    }
}
