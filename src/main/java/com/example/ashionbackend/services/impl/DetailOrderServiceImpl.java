package com.example.ashionbackend.services.impl;

import com.example.ashionbackend.entities.DetailOrder;
import com.example.ashionbackend.repositories.DetailOrderRepository;
import com.example.ashionbackend.services.DetailOrderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailOrderServiceImpl implements DetailOrderService {
	private final DetailOrderRepository detailOrderRepository;

	public DetailOrderServiceImpl(DetailOrderRepository detailOrderRepository) {
		this.detailOrderRepository = detailOrderRepository;
	}

	@Override
	public DetailOrder save(DetailOrder entity) {
		return detailOrderRepository.save(entity);
	}

	@Override
	public DetailOrder findById(int id) {
		return detailOrderRepository.findById(id);
	}

	@Override
	public List<DetailOrder> findAll() {
		return detailOrderRepository.findAll();
	}

	@Override
	public Page<DetailOrder> findAll(Pageable pageable) {
		return detailOrderRepository.findAllByPageable(pageable);
	}

	@Override
	public int updateByIdAndStatus(int id, int status) {
		return detailOrderRepository.updateByIdAndStatus(id, status);
	}
}
