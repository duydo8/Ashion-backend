package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.DiscountOrder;
import com.example.ashionbackend.entities.DiscountOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscountOrderRepository extends JpaRepository<DiscountOrder, Integer> {
	@Query("select a from DiscountOrder a where a.id = ?1 and a.status = 1")
	DiscountOrder findById(int id);

	@Query("select a from DiscountOrder a where a.status = 1")
	List<DiscountOrder> findAll();

	@Query("select a from DiscountOrder a where a.status = 1")
	Page<DiscountOrder> findAllByPageable (Pageable pageable);

	@Query("update from DiscountOrder a set a.status = ?2 where a.id = ?1")
	int updateByIdAndStatus(int id, int status);
}
