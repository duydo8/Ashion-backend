package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.DetailOrder;
import com.example.ashionbackend.entities.DetailOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailOrderRepository extends JpaRepository<DetailOrder, Integer> {
	@Query("select a from DetailOrder a where a.id = ?1 and a.status = 1")
	DetailOrder findById(int id);

	@Query("select a from DetailOrder a where a.status = 1")
	List<DetailOrder> findAll();

	@Query("select a from DetailOrder a where a.status = 1")
	Page<DetailOrder> findAllByPageable (Pageable pageable);

	@Query("update from DetailOrder a set a.status = ?2 where a.id = ?1")
	int updateByIdAndStatus(int id, int status);
}
