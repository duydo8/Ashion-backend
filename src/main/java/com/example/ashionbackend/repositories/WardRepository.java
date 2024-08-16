package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.Ward;
import com.example.ashionbackend.entities.Ward;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WardRepository extends JpaRepository<Ward, Integer> {
	@Query("select a from Ward a where a.id = ?1 and a.status = 1")
	Ward findById(int id);

	@Query("select a from Ward a where a.status = 1")
	List<Ward> findAll();

	@Query("select a from Ward a where a.status = 1")
	Page<Ward> findAllByPageable (Pageable pageable);

	@Query("update from Ward a set a.status = ?2 where a.id = ?1")
	int updateByIdAndStatus(int id, int status);
}
