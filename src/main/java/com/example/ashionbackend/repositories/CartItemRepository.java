package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.CartItems;
import com.example.ashionbackend.entities.CartItems;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<CartItems, Integer> {
	@Query("select a from CartItems a where a.id = ?1 and a.status = 1")
	CartItems findById(int id);

	@Query("select a from CartItems a where a.status = 1")
	List<CartItems> findAll();

	@Query("select a from CartItems a where a.status = 1")
	Page<CartItems> findAllByPageable (Pageable pageable);

	@Query("update from CartItems a set a.status = ?2 where a.id = ?1")
	int updateByIdAndStatus(int id, int status);
}
