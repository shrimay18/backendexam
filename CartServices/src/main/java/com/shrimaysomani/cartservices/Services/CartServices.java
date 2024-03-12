package com.shrimaysomani.cartservices.Services;

import com.shrimaysomani.cartservices.model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartServices {
    public List<Cart> getAllCart();
    public Cart getSingleCart(int id);
}
