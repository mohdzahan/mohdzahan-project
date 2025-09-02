package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wecp.progressive.entity.Product;
import com.wecp.progressive.repository.ProductRepository;
import com.wecp.progressive.service.ProductService;

public class ProductServiceImplJpa  implements ProductService{

    @Autowired
    private ProductRepository productRepository;
    


    public ProductServiceImplJpa(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() throws SQLException{
        return List.of();
    }

    public int getProductbyId(int productId) throws SQLException{
        return -1;
    }

    public int addProduct(Product product) throws SQLException{
        return -1;
    }

    public void updateProduct(Product product) throws SQLException{
      
    }

    public void deleteProduct(int productId) throws SQLException{

    }

   

    @Override
    public Product getProductById(int productId) throws SQLException {
       return null;
    }



}
