package com.example.ashionbackend.services.impl;

import com.example.ashionbackend.entities.Province;
import com.example.ashionbackend.repositories.ProvinceRepository;
import com.example.ashionbackend.services.ProvinceService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {
	private final ProvinceRepository provinceRepository;

	public ProvinceServiceImpl(ProvinceRepository provinceRepository) {
		this.provinceRepository = provinceRepository;
	}

	@Override
	public Province save(Province entity) {
		return provinceRepository.save(entity);
	}

	@Override
	public Province findById(int id) {
		return provinceRepository.findById(id);
	}

	@Override
	public List<Province> findAll() {
		return provinceRepository.findAll();
	}

	@Override
	public Page<Province> findAll(Pageable pageable) {
		return provinceRepository.findAllByPageable(pageable);
	}

	@Override
	public int updateByIdAndStatus(int id, int status) {
		return provinceRepository.updateByIdAndStatus(id, status);
	}
}
