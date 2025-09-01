package com.wecp.progressive.service.impl;

import com.wecp.progressive.dao.WarehouseDAO;
import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;

import java.util.List;

public class WarehouseServiceImplJdbc implements WarehouseService {

    private WarehouseDAO warehouseDAO;

    public WarehouseServiceImplJdbc(WarehouseDAO warehouseDAO) {
        this.warehouseDAO = warehouseDAO;
    }

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
    public void updateWarehouse(Warehouse warehouse) {

    }

    @Override
    public void deleteWarehouse(int warehouseId) {

    }

    @Override
    public Warehouse getWarehouseById(int warehouseId) {
        return null;
    }

    @Override
    public List<Warehouse> getWarehouseBySupplier(int supplierId) {
        return null;
    }
}
