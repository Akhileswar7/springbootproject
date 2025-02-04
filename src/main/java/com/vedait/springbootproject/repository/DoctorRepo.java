package com.vedait.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedait.springbootproject.entities.DoctorEntity;

public interface DoctorRepo extends JpaRepository<DoctorEntity, Integer>{

}
