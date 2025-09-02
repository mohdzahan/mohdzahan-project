package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.repository.WarehouseRepository;
import com.wecp.progressive.service.WarehouseService;

public class WarehouseServiceImplJpa  implements WarehouseService{

    @Autowired
    private WarehouseRepository warehouseRepository;

    

    @Override
    public int addWarehouse(Warehouse warehouse) throws SQLException {
        
        return -1;
    }
public WarehouseServiceImplJpa(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }


    @Override
    public void deleteWarehouse(int warehouseId) throws SQLException {
       
    }

    @Override
    public List<Warehouse> getAllWarehouses() throws SQLException {
        return List.of();
    }

    @Override
    public Warehouse getWarehouseById(int warehouseId) throws SQLException {
        return null;
    }

    @Override
    public List<Warehouse> getWarehouseBySupplier(int supplierId) {
        return null;
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() throws SQLException {
       return List.of();
    }

    @Override
    public void updateWarehouse(Warehouse warehouse) throws SQLException {
        
    }
    
}
