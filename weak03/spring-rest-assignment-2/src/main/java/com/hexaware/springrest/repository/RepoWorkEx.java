package com.hexaware.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.springrest.entity.WorkExperience;
@Repository
public interface RepoWorkEx extends JpaRepository<WorkExperience,Long> {

}
