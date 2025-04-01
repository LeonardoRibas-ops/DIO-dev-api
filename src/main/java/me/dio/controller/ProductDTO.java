package com.santander.santanderdevweek.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class ProductDTO {

    @NotBlank(message = "Nome do produto é obrigatório")
    private String name;

    @NotBlank(message = "Descrição do produto é obrigatória")
    private String description;

    @Positive(message = "Preço deve ser maior que zero")
    private double price;

    // Construtores, Getters e Setters

    public ProductDTO(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
