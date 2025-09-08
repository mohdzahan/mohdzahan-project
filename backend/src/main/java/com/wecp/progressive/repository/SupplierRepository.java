package com.wecp.progressive.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.impl.SupplierServiceImplJdbc;

public interface SupplierRepository extends JpaRepository<Supplier,Integer>{
    
    

    public Supplier deleteBySupplierId(@Param("supplierId") int supplierId);

    public Supplier findBySupplierId(@Param("supplierId") int supplierId);

    public Object findByEmail(String email);

    public Object findByUsername(String username);

}
