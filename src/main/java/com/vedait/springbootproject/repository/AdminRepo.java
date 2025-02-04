package com.vedait.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.vedait.springbootproject.entities.AdminEntity;
import com.vedait.springbootproject.models.AdminModel;

public interface AdminRepo extends JpaRepository<AdminEntity, String>{

	AdminModel findByUsername(String username);
}
