package com.example.ashionbackend.services.impl;

import com.example.ashionbackend.entities.CartItems;
import com.example.ashionbackend.repositories.CartItemRepository;
import com.example.ashionbackend.services.CartItemService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemServiceImpl implements CartItemService {
	private final CartItemRepository cartItemRepository;

	public CartItemServiceImpl(CartItemRepository cartItemRepository) {
		this.cartItemRepository = cartItemRepository;
	}
	@Override
	public CartItems save(CartItems entity) {
		return cartItemRepository.save(entity);
	}

	@Override
	public CartItems findById(int id) {
		return cartItemRepository.findById(id);
	}

	@Override
	public List<CartItems> findAll() {
		return cartItemRepository.findAll();
	}

	@Override
	public Page<CartItems> findAll(Pageable pageable) {
		return cartItemRepository.findAllByPageable(pageable);
	}

	@Override
	public int updateByIdAndStatus(int id, int status) {
		return cartItemRepository.updateByIdAndStatus(id, status);
	}
}
