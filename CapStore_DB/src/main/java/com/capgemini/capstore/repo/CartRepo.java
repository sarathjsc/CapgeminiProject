package com.capgemini.capstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capstore.beans.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer>{

}
