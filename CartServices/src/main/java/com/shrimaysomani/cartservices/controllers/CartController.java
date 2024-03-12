package com.shrimaysomani.cartservices.controllers;

import com.shrimaysomani.cartservices.Services.CartServices;
import com.shrimaysomani.cartservices.model.Cart;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {
    CartServices cartServices;

    public CartController(CartServices cart){
        this.cartServices = cart;
    }

    @GetMapping("/carts")
    public List<Cart> getAllCart(){
        return cartServices.getAllCart();
    }

    @GetMapping("/carts/{id}")
    public Cart getSingleCart(@PathVariable("id") int id){
        return cartServices.getSingleCart(id);
    }


}
