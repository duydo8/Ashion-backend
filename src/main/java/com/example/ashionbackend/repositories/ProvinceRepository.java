package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.Province;
import com.example.ashionbackend.entities.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Integer> {
	@Query("select a from Province a where a.id = ?1 and a.status = 1")
	Province findById(int id);

	@Query("select a from Province a where a.status = 1")
	List<Province> findAll();

	@Query("select a from Province a where a.status = 1")
	Page<Province> findAllByPageable (Pageable pageable);

	@Query("update from Province a set a.status = ?2 where a.id = ?1")
	int updateByIdAndStatus(int id, int status);
}
