package com.santander.santanderdevweek.service;

import com.santander.santanderdevweek.dto.ProductDTO;
import com.santander.santanderdevweek.exception.ProductNotFoundException;
import com.santander.santanderdevweek.model.Product;
import com.santander.santanderdevweek.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Criação de um novo produto
    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        
        Product savedProduct = productRepository.save(product);
        return new ProductDTO(savedProduct.getName(), savedProduct.getDescription(), savedProduct.getPrice());
    }

    // Busca de um produto por ID
    public ProductDTO getProductById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Produto não encontrado"));
        return new ProductDTO(product.getName(), product.getDescription(), product.getPrice());
    }
}
