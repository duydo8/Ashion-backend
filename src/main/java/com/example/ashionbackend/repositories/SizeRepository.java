package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.Size;
import com.example.ashionbackend.entities.Size;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SizeRepository extends JpaRepository<Size, Integer> {
	@Query("select a from Size a where a.id = ?1 and a.status = 1")
	Size findById(int id);

	@Query("select a from Size a where a.status = 1")
	List<Size> findAll();

	@Query("select a from Size a where a.status = 1")
	Page<Size> findAllByPageable (Pageable pageable);

	@Query("update from Size a set a.status = ?2 where a.id = ?1")
	int updateByIdAndStatus(int id, int status);
}
