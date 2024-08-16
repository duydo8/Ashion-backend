package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.Tag;
import com.example.ashionbackend.entities.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<Tag, Integer> {
	@Query("select a from Tag a where a.id = ?1 and a.status = 1")
	Tag findById(int id);

	@Query("select a from Tag a where a.status = 1")
	List<Tag> findAll();

	@Query("select a from Tag a where a.status = 1")
	Page<Tag> findAllByPageable (Pageable pageable);

	@Query("update from Tag a set a.status = ?2 where a.id = ?1")
	int updateByIdAndStatus(int id, int status);
}
