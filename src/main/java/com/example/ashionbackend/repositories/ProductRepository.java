package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.Product;
import com.example.ashionbackend.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	@Query("select a from Product a where a.id = ?1 and a.status = 1")
	Product findById(int id);

	@Query("select a from Product a where a.status = 1")
	List<Product> findAll();

	@Query("select a from Product a where a.status = 1")
	Page<Product> findAllByPageable (Pageable pageable);

	@Query("update from Product a set a.status = ?2 where a.id = ?1")
	int updateByIdAndStatus(int id, int status);
}
