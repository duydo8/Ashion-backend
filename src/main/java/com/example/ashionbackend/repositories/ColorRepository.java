package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.Color;
import com.example.ashionbackend.entities.Color;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColorRepository extends JpaRepository<Color, Integer> {
	@Query("select a from Color a where a.id = ?1 and a.status = 1")
	Color findById(int id);

	@Query("select a from Color a where a.status = 1")
	List<Color> findAll();

	@Query("select a from Color a where a.status = 1")
	Page<Color> findAllByPageable (Pageable pageable);

	@Query("update from Color a set a.status = ?2 where a.id = ?1")
	int updateByIdAndStatus(int id, int status);
}
