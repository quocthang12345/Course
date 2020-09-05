package com.SpringMVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringMVC.model.entity.HistoryEntity;

public interface HistoryRepository extends JpaRepository<HistoryEntity, Long> {

}
