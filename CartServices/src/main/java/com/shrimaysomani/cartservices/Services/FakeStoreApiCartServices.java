package com.shrimaysomani.cartservices.Services;

import com.shrimaysomani.cartservices.DTOs.FakeStoreApiDTO;
import com.shrimaysomani.cartservices.DTOs.Product;
import com.shrimaysomani.cartservices.model.Cart;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Service
class FakeStoreApiCartServices implements CartServices {
    RestTemplate restTemplate = new RestTemplate();

    @Override
    public List<Cart> getAllCart() {
        FakeStoreApiDTO[] carts = restTemplate.getForObject(
                "https://fakestoreapi.com/carts",
                FakeStoreApiDTO[].class
        );
        if (carts != null) {
            List<Cart> cartList = new ArrayList<>();
            for (FakeStoreApiDTO DTO : carts) {
                Cart cart = new Cart();
                cart.setId(DTO.getId());
                cart.setUserid(DTO.getUserId());
                cart.setDate(DTO.getDate());
                cart.setProducts(DTO.getProducts());
                cartList.add(cart);
            }
            return cartList;
        }
        return null;
    }
    public Cart getSingleCart(int id){
        FakeStoreApiDTO cart = restTemplate.getForObject(
                "https://fakestoreapi.com/carts/"+id,
                FakeStoreApiDTO.class);
        if(cart != null){
            Cart cart1 = new Cart();
            cart1.setId(cart.getId());
            cart1.setUserid(cart.getUserId());
            cart1.setDate(cart.getDate());
            cart1.setProducts(cart.getProducts());
            return cart1;
        }
        return null;

    }



}


