package com.wecp.progressive.service;

import com.wecp.progressive.entity.Warehouse;

import java.sql.SQLException;
import java.util.List;


public interface WarehouseService {
    List<Warehouse> getAllWarehouses() throws SQLException;

    int addWarehouse(Warehouse warehouse) throws SQLException;

    List<Warehouse> getWarehousesSortedByCapacity() throws SQLException;

    //Do not implement these methods in WarehouseServiceImplArraylist.java class

    default void emptyArrayList(){
        
    }
    default void updateWarehouse(Warehouse warehouse) throws SQLException{
    }

    default void deleteWarehouse(int warehouseId) throws SQLException{
    }

    default Warehouse getWarehouseById(int warehouseId) throws SQLException{
        return null;
    }
    //Do not implement these methods in WarehouseServiceImplArraylist.java and WarehouseServiceImplJdbc.java class
    default List<Warehouse> getWarehouseBySupplier(int supplierId) {
        return null;
    }
}
