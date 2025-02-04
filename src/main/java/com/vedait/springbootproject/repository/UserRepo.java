package com.vedait.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedait.springbootproject.entities.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer>{

}
