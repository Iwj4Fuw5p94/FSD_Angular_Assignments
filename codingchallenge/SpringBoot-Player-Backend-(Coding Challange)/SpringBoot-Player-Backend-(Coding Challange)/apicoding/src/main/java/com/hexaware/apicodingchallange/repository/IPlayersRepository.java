package com.hexaware.apicodingchallange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hexaware.apicodingchallange.entity.Players;

@Repository
public interface IPlayersRepository extends JpaRepository<Players, Long>{

	@Query("select SUM(p.totalMatches) from Players p where p.country = :country")
   public Long findTotalMatchesByCountry(@Param("country") String country);
	
	
	
	
}
