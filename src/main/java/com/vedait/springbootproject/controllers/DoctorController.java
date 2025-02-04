package com.vedait.springbootproject.controllers;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.vedait.springbootproject.models.DoctorModel;
import com.vedait.springbootproject.services.DoctorService;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/getAll")
    public List<DoctorModel> getAllDoctors() {
        List<DoctorModel> doctors = doctorService.getAllDoctors();
        return doctors;
    }

    @GetMapping("/{id}")
    public DoctorModel getDoctorById(@PathVariable int id) {
        return doctorService.getDoctorById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addDoctor(@RequestBody DoctorModel doctorModel) {
        doctorService.addDoctor(doctorModel);
        return new ResponseEntity<>("Doctor added successfully", HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public void updateDoctor(@PathVariable int id, @RequestBody DoctorModel doctorModel) {
        doctorService.updateDoctor(id, doctorModel);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDoctor(@PathVariable int id) {
        doctorService.deleteDoctor(id);
    }
}
