package com.example.ashionbackend.services.impl;

import com.example.ashionbackend.entities.Material;
import com.example.ashionbackend.entities.Material;
import com.example.ashionbackend.repositories.MaterialRepository;
import com.example.ashionbackend.services.MaterialService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {
	private final MaterialRepository materialRepository;

	public MaterialServiceImpl(MaterialRepository materialRepository) {
		this.materialRepository = materialRepository;
	}

	@Override
	public Material save(Material entity) {
		return materialRepository.save(entity);
	}

	@Override
	public Material findById(int id) {
		return materialRepository.findById(id);
	}

	@Override
	public List<Material> findAll() {
		return materialRepository.findAll();
	}

	@Override
	public Page<Material> findAll(Pageable pageable) {
		return materialRepository.findAllByPageable(pageable);
	}

	@Override
	public int updateByIdAndStatus(int id, int status) {
		return materialRepository.updateByIdAndStatus(id, status);
	}
}
