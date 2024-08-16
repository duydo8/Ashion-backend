package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.TagProduct;
import com.example.ashionbackend.entities.TagProduct;
import com.example.ashionbackend.entities.TagProductId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagProductRepository extends JpaRepository<TagProduct, TagProductId> {
	@Query("select a from TagProduct a where a.tagProductId = ?1 and a.status = 1")
	TagProduct findById(int id);

	@Query("select a from TagProduct a where a.status = 1")
	List<TagProduct> findAll();

	@Query("select a from TagProduct a where a.status = 1")
	Page<TagProduct> findAllByPageable (Pageable pageable);

	@Query("update from TagProduct a set a.status = ?2 where a.tagProductId = ?1")
	int updateByIdAndStatus(int id, int status);
}
