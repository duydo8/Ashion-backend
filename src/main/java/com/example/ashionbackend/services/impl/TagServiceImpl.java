package com.example.ashionbackend.services.impl;

import com.example.ashionbackend.entities.Tag;
import com.example.ashionbackend.repositories.TagRepository;
import com.example.ashionbackend.services.TagService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {
	private final TagRepository tagRepository;

	public TagServiceImpl(TagRepository tagRepository) {
		this.tagRepository = tagRepository;
	}

	@Override
	public Tag save(Tag entity) {
		return tagRepository.save(entity);
	}

	@Override
	public Tag findById(int id) {
		return tagRepository.findById(id);
	}

	@Override
	public List<Tag> findAll() {
		return tagRepository.findAll();
	}

	@Override
	public Page<Tag> findAll(Pageable pageable) {
		return tagRepository.findAllByPageable(pageable);
	}

	@Override
	public int updateByIdAndStatus(int id, int status) {
		return tagRepository.updateByIdAndStatus(id, status);
	}
}
