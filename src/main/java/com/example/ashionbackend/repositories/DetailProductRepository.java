package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.DetailProduct;
import com.example.ashionbackend.entities.DetailProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailProductRepository extends JpaRepository<DetailProduct, Integer> {
	@Query("select a from DetailProduct a where a.id = ?1 and a.status = 1")
	DetailProduct findById(int id);

	@Query("select a from DetailProduct a where a.status = 1")
	List<DetailProduct> findAll();

	@Query("select a from DetailProduct a where a.status = 1")
	Page<DetailProduct> findAllByPageable (Pageable pageable);

	@Query("update from DetailProduct a set a.status = ?2 where a.id = ?1")
	int updateByIdAndStatus(int id, int status);
}
