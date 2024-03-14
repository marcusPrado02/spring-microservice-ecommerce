package br.com.marcusprado.shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.marcusprado.shoppingcart.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {}
