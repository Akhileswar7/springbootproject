package com.vedait.springbootproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.vedait.springbootproject.entities.AdminEntity;
import com.vedait.springbootproject.models.AdminModel;
import com.vedait.springbootproject.repository.AdminRepo;
import com.vedait.springbootproject.services.AdminService;
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private AdminRepo adminRepo;
    

    private boolean checkCredentials(String username, String password) {
        AdminModel admin = adminRepo.findByUsername(username);

        return admin != null && admin.getPassword().equals(password);
    }

    @RequestMapping("/AdminCheck")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model) {

        if (checkCredentials(username, password)) {
            return "redirect:/adminhome"; // Redirect to adminhome after successful login
        } else {
            // Add error message if credentials are invalid
            model.addAttribute("message", "Invalid username or password.");
            return "adminlogin";
        }
    }


    @PostMapping("/add")
    public void addAdmin(@RequestBody AdminEntity adminEntity) {
        adminService.addAdmin(adminEntity);
    }

    @GetMapping("/{username}")
    public AdminEntity getAdminByUsername(@PathVariable String username) {
        return adminService.getAdminByUsername(username);
    }

    @PutMapping("/{username}")
    public void updateAdminPassword(@PathVariable String username,@RequestBody String newPassword) {
       adminService.updateAdminPassword(username, newPassword); 
    }

    @DeleteMapping("/{username}")
    public void deleteAdmin(@PathVariable String username) {
        adminService.deleteAdmin(username);
    }
}
