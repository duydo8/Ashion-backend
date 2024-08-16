package com.example.ashionbackend.services.impl;

import com.example.ashionbackend.entities.District;
import com.example.ashionbackend.entities.District;
import com.example.ashionbackend.repositories.DistrictRepository;
import com.example.ashionbackend.services.DistrictService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {
	private final DistrictRepository districtRepository;

	public DistrictServiceImpl(DistrictRepository districtRepository) {
		this.districtRepository = districtRepository;
	}

	@Override
	public District save(District entity) {
		return districtRepository.save(entity);
	}

	@Override
	public District findById(int id) {
		return districtRepository.findById(id);
	}

	@Override
	public List<District> findAll() {
		return districtRepository.findAll();
	}

	@Override
	public Page<District> findAll(Pageable pageable) {
		return districtRepository.findAllByPageable(pageable);
	}

	@Override
	public int updateByIdAndStatus(int id, int status) {
		return districtRepository.updateByIdAndStatus(id, status);
	}
}
