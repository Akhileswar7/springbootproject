package com.vedait.springbootproject.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctors")
public class DoctorEntity {

    @Id
    @Column(name = "doctor_id") 
    private int doctor_id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "dob")
    private String dob;

    @Column(name = "qualification")
    private String qualification;

    @Column(name = "specialist")
    private String specialist;

    @Column(name = "email")
    private String email;

    @Column(name = "mobno")
    private String mobno;

    @Column(name = "password")
    private String password;

    public DoctorEntity() {
    }

    public DoctorEntity(int doctor_id, String fullName, String dob, String qualification, String specialist, String email, String mobno, String password) {
        this.doctor_id = doctor_id;
        this.fullName = fullName;
        this.dob = dob;
        this.qualification = qualification;
        this.specialist = specialist;
        this.email = email;
        this.mobno = mobno;
        this.password = password;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DoctorEntity{" +
                "doctor_id=" + doctor_id +
                ", fullName='" + fullName + '\'' +
                ", dob='" + dob + '\'' +
                ", qualification='" + qualification + '\'' +
                ", specialist='" + specialist + '\'' +
                ", email='" + email + '\'' +
                ", mobno='" + mobno + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
