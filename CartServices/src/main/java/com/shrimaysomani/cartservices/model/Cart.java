package com.shrimaysomani.cartservices.model;

import com.shrimaysomani.cartservices.DTOs.Product;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cart {
    public int id;
    public long userid;
    public String date;
    public Product products;
}
