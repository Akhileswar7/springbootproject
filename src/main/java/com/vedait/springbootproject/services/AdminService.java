package com.vedait.springbootproject.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.vedait.springbootproject.entities.AdminEntity;
import com.vedait.springbootproject.repository.AdminRepo;

@Service
public class AdminService {

    @Autowired
    private AdminRepo adminRepository;

    
    public void addAdmin(AdminEntity adminEntity) {
        adminRepository.save(adminEntity);
    }

    public AdminEntity getAdminByUsername(String username) {
        return adminRepository.findById(username).orElse(null);
    }

    public void updateAdminPassword(String username, String newPassword) {
        AdminEntity admin = adminRepository.findById(username).orElse(null);
        if (admin != null) {
            admin.setPassword(newPassword);
            adminRepository.save(admin);
        }
    }

    public void deleteAdmin(String username) {
        if (adminRepository.existsById(username)) {
            adminRepository.deleteById(username);
        }
    }
}
