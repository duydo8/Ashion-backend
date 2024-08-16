package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.Category;
import com.example.ashionbackend.entities.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	@Query("select a from Category a where a.id = ?1 and a.status = 1")
	Category findById(int id);

	@Query("select a from Category a where a.status = 1")
	List<Category> findAll();

	@Query("select a from Category a where a.status = 1")
	Page<Category> findAllByPageable (Pageable pageable);

	@Query("update from Category a set a.status = ?2 where a.id = ?1")
	int updateByIdAndStatus(int id, int status);
}
