package com.example.ashionbackend.services.impl;

import com.example.ashionbackend.entities.Category;
import com.example.ashionbackend.repositories.CategoryRepository;
import com.example.ashionbackend.services.CategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
	private final CategoryRepository categoryRepository;

	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public Category save(Category entity) {
		return categoryRepository.save(entity);
	}

	@Override
	public Category findById(int id) {
		return categoryRepository.findById(id);
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Page<Category> findAll(Pageable pageable) {
		return categoryRepository.findAllByPageable(pageable);
	}

	@Override
	public int updateByIdAndStatus(int id, int status) {
		return categoryRepository.updateByIdAndStatus(id, status);
	}
}
