package com.example.ashionbackend.services.impl;

import com.example.ashionbackend.entities.Size;
import com.example.ashionbackend.repositories.SizeRepository;
import com.example.ashionbackend.services.SizeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeServiceImpl implements SizeService {
	private final SizeRepository sizeRepository;

	public SizeServiceImpl(SizeRepository sizeRepository) {
		this.sizeRepository = sizeRepository;
	}

	@Override
	public Size save(Size entity) {
		return sizeRepository.save(entity);
	}

	@Override
	public Size findById(int id) {
		return sizeRepository.findById(id);
	}

	@Override
	public List<Size> findAll() {
		return sizeRepository.findAll();
	}

	@Override
	public Page<Size> findAll(Pageable pageable) {
		return sizeRepository.findAllByPageable(pageable);
	}

	@Override
	public int updateByIdAndStatus(int id, int status) {
		return sizeRepository.updateByIdAndStatus(id, status);
	}
}
