package com.vedait.springbootproject.models;

public class DoctorModel {

    private int doctor_id;
    private String fullName;
    private String dob;
    private String qualification;
    private String specialist;
    private String email;
    private String mobno;
    private String password;

    public DoctorModel() {
    }

    public DoctorModel(int doctor_id, String fullName, String dob, String qualification, String specialist, String email, String mobno, String password) {
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
        return "DoctorModel{" +
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
