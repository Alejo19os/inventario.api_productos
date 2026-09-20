package com.inventario.api_productos.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Productos")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String name;

    @Column (nullable = false)
    private Double price;

    @Column (nullable = false)
    private Integer stock;

    private String category;






}
