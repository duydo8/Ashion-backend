package com.example.ashionbackend.services.impl;

import com.example.ashionbackend.entities.Comment;
import com.example.ashionbackend.repositories.CommentRepository;
import com.example.ashionbackend.services.CommentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
	private final CommentRepository commentRepository;

	public CommentServiceImpl(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
	}

	@Override
	public Comment save(Comment entity) {
		return commentRepository.save(entity);
	}

	@Override
	public Comment findById(int id) {
		return commentRepository.findById(id);
	}

	@Override
	public List<Comment> findAll() {
		return commentRepository.findAll();
	}

	@Override
	public Page<Comment> findAll(Pageable pageable) {
		return commentRepository.findAllByPageable(pageable);
	}

	@Override
	public int updateByIdAndStatus(int id, int status) {
		return commentRepository.updateByIdAndStatus(id, status);
	}
}
