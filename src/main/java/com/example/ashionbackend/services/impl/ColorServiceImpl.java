package com.example.ashionbackend.services.impl;

import com.example.ashionbackend.entities.Color;
import com.example.ashionbackend.repositories.ColorRepository;
import com.example.ashionbackend.services.ColorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServiceImpl implements ColorService {
	private final ColorRepository colorRepository;

	public ColorServiceImpl(ColorRepository colorRepository) {
		this.colorRepository = colorRepository;
	}

	@Override
	public Color save(Color entity) {
		return colorRepository.save(entity);
	}

	@Override
	public Color findById(int id) {
		return colorRepository.findById(id);
	}

	@Override
	public List<Color> findAll() {
		return colorRepository.findAll();
	}

	@Override
	public Page<Color> findAll(Pageable pageable) {
		return colorRepository.findAllByPageable(pageable);
	}

	@Override
	public int updateByIdAndStatus(int id, int status) {
		return colorRepository.updateByIdAndStatus(id, status);
	}
}
