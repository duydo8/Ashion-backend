package com.example.ashionbackend.services.impl;

import com.example.ashionbackend.entities.Ward;
import com.example.ashionbackend.repositories.WardRepository;
import com.example.ashionbackend.services.WardService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WardServiceImpl implements WardService {
	private final WardRepository wardRepository;

	public WardServiceImpl(WardRepository wardRepository) {
		this.wardRepository = wardRepository;
	}

	@Override
	public Ward save(Ward entity) {
		return wardRepository.save(entity);
	}

	@Override
	public Ward findById(int id) {
		return wardRepository.findById(id);
	}

	@Override
	public List<Ward> findAll() {
		return wardRepository.findAll();
	}

	@Override
	public Page<Ward> findAll(Pageable pageable) {
		return wardRepository.findAllByPageable(pageable);
	}

	@Override
	public int updateByIdAndStatus(int id, int status) {
		return wardRepository.updateByIdAndStatus(id, status);
	}
}
