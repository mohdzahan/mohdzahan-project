package com.wecp.progressive.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.wecp.progressive.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer>{

    Supplier deleteBySupplierId(@Param("supplierId") int supplier_id);
    Supplier findBySupplierId(@Param("supplierId") int supplierId);
    
}
