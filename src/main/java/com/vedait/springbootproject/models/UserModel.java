package com.vedait.springbootproject.models;

public class UserModel {

	private int user_id;
    private String fullName;
    private String gender;
    private int age;
    private String appointmentDate;
    private String email;
    private String phoneNo;
    private String diseases;
    private String doctor;
    private String fullAddress;

    public UserModel() {
    }

   

    public UserModel(int user_id, String fullName, String gender, int age, String appointmentDate, String email,
			String phoneNo, String diseases, String doctor, String fullAddress) {
		super();
		this.user_id = user_id;
		this.fullName = fullName;
		this.gender = gender;
		this.age = age;
		this.appointmentDate = appointmentDate;
		this.email = email;
		this.phoneNo = phoneNo;
		this.diseases = diseases;
		this.doctor = doctor;
		this.fullAddress = fullAddress;
	}



	public int getUser_id() {
		return user_id;
	}



	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}



	public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDiseases() {
        return diseases;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }



	@Override
	public String toString() {
		return "UserModel [user_id=" + user_id + ", fullName=" + fullName + ", gender=" + gender + ", age=" + age
				+ ", appointmentDate=" + appointmentDate + ", email=" + email + ", phoneNo=" + phoneNo + ", diseases="
				+ diseases + ", doctor=" + doctor + ", fullAddress=" + fullAddress + "]";
	}

	
}
