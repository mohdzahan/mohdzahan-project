package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Product;

import java.util.List;

public class ProductDAOImpl implements ProductDAO {

    @Override
    public int addProduct(Product products) {
        return -1;
    }

    @Override
    public Product getProductById(int productId) {
        return null;
    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(int productId) {

    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }
}
