package com.example.ashionbackend.services.impl;

import com.example.ashionbackend.entities.Order;
import com.example.ashionbackend.repositories.OrderRepository;
import com.example.ashionbackend.services.OrderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
	private final OrderRepository orderRepository;

	public OrderServiceImpl(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
	public Order save(Order entity) {
		return orderRepository.save(entity);
	}

	@Override
	public Order findById(int id) {
		return orderRepository.findById(id);
	}

	@Override
	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	@Override
	public Page<Order> findAll(Pageable pageable) {
		return orderRepository.findAllByPageable(pageable);
	}

	@Override
	public int updateByIdAndStatus(int id, int status) {
		return orderRepository.updateByIdAndStatus(id, status);
	}
}
