package com.SpringMVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringMVC.model.entity.UserEntity;

public interface userRepository extends JpaRepository<UserEntity, Long> {

}
