package com.example.ecommerce.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.example.ecommerce.entities.Order;
import com.example.ecommerce.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK implements Serializable {
	
}
