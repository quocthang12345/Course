package com.SpringMVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringMVC.model.entity.MajorEntity;

public interface MajorRepository extends JpaRepository<MajorEntity, Long> {
	MajorEntity findByMajorCode(String majorCode);
}
