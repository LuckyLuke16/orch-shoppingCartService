package com.example.shoppingcartservice.controller;

import com.example.shoppingcartservice.model.ShoppingCartItemDTO;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/shopping-cart")
public interface ShoppingCartOperations {

    @GetMapping
    ShoppingCartItemDTO fetchShoppingCartContent(@RequestParam String user);

    @DeleteMapping("/{itemId}")
    void deleteShoppingCartItem(@PathVariable int itemId, @RequestParam String user);

    @PostMapping("/{itemId}")
    int addShoppingCartItemFromUser(@PathVariable int itemId, @RequestParam String user);

}
