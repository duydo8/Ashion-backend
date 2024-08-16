package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.District;
import com.example.ashionbackend.entities.District;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {
	@Query("select a from District a where a.id = ?1 and a.status = 1")
	District findById(int id);

	@Query("select a from District a where a.status = 1")
	List<District> findAll();

	@Query("select a from District a where a.status = 1")
	Page<District> findAllByPageable (Pageable pageable);

	@Query("update from District a set a.status = ?2 where a.id = ?1")
	int updateByIdAndStatus(int id, int status);
}
