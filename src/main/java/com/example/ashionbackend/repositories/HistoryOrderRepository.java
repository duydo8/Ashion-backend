package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.HistoryOrder;
import com.example.ashionbackend.entities.HistoryOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoryOrderRepository extends JpaRepository<HistoryOrder, Integer> {
	@Query("select a from HistoryOrder a where a.id = ?1 and a.status = 1")
	HistoryOrder findById(int id);

	@Query("select a from HistoryOrder a where a.status = 1")
	List<HistoryOrder> findAll();

	@Query("select a from HistoryOrder a where a.status = 1")
	Page<HistoryOrder> findAllByPageable (Pageable pageable);

	@Query("update from HistoryOrder a set a.status = ?2 where a.id = ?1")
	int updateByIdAndStatus(int id, int status);
}
