package com.example.ashionbackend.config;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IGenericService<T> {
	T save(T entity);

	T findById(int id);

	List<T> findAll();

	Page<T> findAll(Pageable pageable);

	int updateByIdAndStatus(int id, int status);

}
