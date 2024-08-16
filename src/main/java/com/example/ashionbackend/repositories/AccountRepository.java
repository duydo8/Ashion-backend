package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
	@Query("select a from Account a where a.id = ?1 and a.status = 1")
	Account findById(int id);

	@Query("select a from Account a where a.status = 1")
	List<Account> findAll();

	@Query("select a from Account a where a.status = 1")
	Page<Account> findAllByPageable(Pageable pageable);

	@Query("update from Account a set a.status = ?2 where a.id = ?1")
	int updateByIdAndStatus(int id, int status);

	@Query(value = "select * from accounts where username like '%?1%'", nativeQuery = true)
	List<Account> findAccountByContainName(String name);

	@Query("select a from Account a where a.phoneNumber = ?1 and a.status = 1")
	Account findAccountByPhoneNumber(String phoneNumber);

	@Query("select a from Account a where a.username = ?1 and a.status = 1")
	Account findAccountByUsername(String name);

	@Query("update from Account a set a.status = ?2 where a.id = ?1")
	int updateStatusById(int id, int status);
}
