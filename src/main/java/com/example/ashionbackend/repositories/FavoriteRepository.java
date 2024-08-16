package com.example.ashionbackend.repositories;

import com.example.ashionbackend.entities.Favorite;
import com.example.ashionbackend.entities.Favorite;
import com.example.ashionbackend.entities.FavoriteId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId> {
	@Query("select a from Favorite a where a.favoriteId = ?1 and a.status = 1")
	Favorite findById(int id);

	@Query("select a from Favorite a where a.status = 1")
	List<Favorite> findAll();

	@Query("select a from Favorite a where a.status = 1")
	Page<Favorite> findAllByPageable (Pageable pageable);

	@Query("update from Favorite a set a.status = ?2 where a.favoriteId = ?1")
	int updateByIdAndStatus(int id, int status);
}
