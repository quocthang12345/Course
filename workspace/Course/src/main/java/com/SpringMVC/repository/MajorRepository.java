package com.SpringMVC.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringMVC.model.entity.MajorEntity;

public interface MajorRepository extends JpaRepository<MajorEntity, Long> {
	MajorEntity findByMajorCode(String majorCode);
	
	@Query(value = "SELECT m FROM MajorEntity m WHERE m.majorName LIKE %?1%")
	List<MajorEntity> search(String keyword) ;
}
