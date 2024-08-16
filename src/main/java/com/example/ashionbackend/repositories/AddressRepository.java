package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.Address;
import com.example.ashionbackend.entities.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
	@Query("select a from Address a where a.id = ?1 and a.status = 1")
	Address findById(int id);

	@Query("select a from Address a where a.status = 1")
	List<Address> findAll();

	@Query("select a from Address a where a.status = 1")
	Page<Address> findAllByPageable (Pageable pageable);

	@Query("update from Address a set a.status = ?2 where a.id = ?1")
	int updateByIdAndStatus(int id, int status);
}
