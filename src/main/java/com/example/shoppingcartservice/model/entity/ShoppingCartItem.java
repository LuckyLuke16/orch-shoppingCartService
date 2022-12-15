package com.example.shoppingcartservice.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Data
@Entity
@IdClass(ShoppingCartItemId.class)
@Table(name = "items")
public class ShoppingCartItem {

    @Id
    private int productId;

    @Id
    private String userId;

    private int quantity;
}
