package com.shrimaysomani.cartservices.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreApiDTO {
    public int id;
    public long userId;
    public String date;
    public Product products;

//    public long getUserid() {
//    }
}
