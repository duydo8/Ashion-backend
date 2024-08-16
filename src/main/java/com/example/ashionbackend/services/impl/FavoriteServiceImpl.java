package com.example.ashionbackend.services.impl;

import com.example.ashionbackend.entities.Favorite;
import com.example.ashionbackend.entities.Favorite;
import com.example.ashionbackend.entities.FavoriteId;
import com.example.ashionbackend.repositories.FavoriteRepository;
import com.example.ashionbackend.services.FavoriteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteServiceImpl implements FavoriteService {
	private final FavoriteRepository favoriteRepository;

	public FavoriteServiceImpl(FavoriteRepository favoriteRepository) {
		this.favoriteRepository = favoriteRepository;
	}

	@Override
	public Favorite save(Favorite entity) {
		return favoriteRepository.save(entity);
	}

	@Override
	public Favorite findById(int id) {
		return favoriteRepository.findById(id);
	}

	@Override
	public List<Favorite> findAll() {
		return favoriteRepository.findAll();
	}

	@Override
	public Page<Favorite> findAll(Pageable pageable) {
		return favoriteRepository.findAllByPageable(pageable);
	}

	@Override
	public int updateByIdAndStatus(int id, int status) {
		return favoriteRepository.updateByIdAndStatus(id, status);
	}
}
