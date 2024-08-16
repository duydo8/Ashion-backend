package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.Order;
import com.example.ashionbackend.entities.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
	@Query("select a from Order a where a.id = ?1 and a.status = 1")
	Order findById(int id);

	@Query("select a from Order a where a.status = 1")
	List<Order> findAll();

	@Query("select a from Order a where a.status = 1")
	Page<Order> findAllByPageable (Pageable pageable);

	@Query("update from Order a set a.status = ?2 where a.id = ?1")
	int updateByIdAndStatus(int id, int status);
}
