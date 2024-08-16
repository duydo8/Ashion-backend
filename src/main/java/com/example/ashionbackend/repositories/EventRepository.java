package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.Event;
import com.example.ashionbackend.entities.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
	@Query("select a from Event a where a.id = ?1 and a.status = 1")
	Event findById(int id);

	@Query("select a from Event a where a.status = 1")
	List<Event> findAll();

	@Query("select a from Event a where a.status = 1")
	Page<Event> findAllByPageable (Pageable pageable);

	@Query("update from Event a set a.status = ?2 where a.id = ?1")
	int updateByIdAndStatus(int id, int status);
}
