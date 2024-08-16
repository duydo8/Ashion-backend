package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.Comment;
import com.example.ashionbackend.entities.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
	@Query("select a from Comment a where a.id = ?1 and a.status = 1")
	Comment findById(int id);

	@Query("select a from Comment a where a.status = 1")
	List<Comment> findAll();

	@Query("select a from Comment a where a.status = 1")
	Page<Comment> findAllByPageable (Pageable pageable);

	@Query("update from Comment a set a.status = ?2 where a.id = ?1")
	int updateByIdAndStatus(int id, int status);
}
