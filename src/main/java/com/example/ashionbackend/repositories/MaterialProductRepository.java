package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.MaterialProduct;
import com.example.ashionbackend.entities.MaterialProduct;
import com.example.ashionbackend.entities.MaterialProductId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterialProductRepository extends JpaRepository<MaterialProduct, MaterialProductId> {
	@Query("select a from MaterialProduct a where a.materialProductId = ?1 and a.status = 1")
	MaterialProduct findById(int id);

	@Query("select a from MaterialProduct a where a.status = 1")
	List<MaterialProduct> findAll();

	@Query("select a from MaterialProduct a where a.status = 1")
	Page<MaterialProduct> findAllByPageable (Pageable pageable);

	@Query("update from MaterialProduct a set a.status = ?2 where a.materialProductId = ?1")
	int updateByIdAndStatus(int id, int status);
}
