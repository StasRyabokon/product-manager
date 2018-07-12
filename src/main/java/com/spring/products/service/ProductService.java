/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.products.service;

import com.spring.products.model.Product;
import java.util.List;

/**
 *
 * @author stas
 */
public interface ProductService {
    
    public Product saveProduct(Product product);
    
    public List<Product> getAllProducts();
    
    public Product findProduct(String id);
    
    public void deleteProduct(String id);
    
    
    
}
