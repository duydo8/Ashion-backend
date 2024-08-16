package com.example.ashionbackend.services.impl;

import com.example.ashionbackend.entities.DetailProduct;
import com.example.ashionbackend.repositories.DetailProductRepository;
import com.example.ashionbackend.services.DetailProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailProductServiceImpl implements DetailProductService {
	private final DetailProductRepository detailProductRepository;

	public DetailProductServiceImpl(DetailProductRepository detailProductRepository) {
		this.detailProductRepository = detailProductRepository;
	}

	@Override
	public DetailProduct save(DetailProduct entity) {
		return detailProductRepository.save(entity);
	}

	@Override
	public DetailProduct findById(int id) {
		return detailProductRepository.findById(id);
	}

	@Override
	public List<DetailProduct> findAll() {
		return detailProductRepository.findAll();
	}

	@Override
	public Page<DetailProduct> findAll(Pageable pageable) {
		return detailProductRepository.findAllByPageable(pageable);
	}

	@Override
	public int updateByIdAndStatus(int id, int status) {
		return detailProductRepository.updateByIdAndStatus(id, status);
	}
}
