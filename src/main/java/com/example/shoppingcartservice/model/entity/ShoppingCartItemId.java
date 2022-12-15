package com.example.shoppingcartservice.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class ShoppingCartItemId implements Serializable {

    private String userId;

    private int productId;
}
