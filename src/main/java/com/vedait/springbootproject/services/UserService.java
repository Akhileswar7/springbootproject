package com.vedait.springbootproject.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import com.vedait.springbootproject.entities.UserEntity;
import com.vedait.springbootproject.models.UserModel;
import com.vedait.springbootproject.repository.UserRepo;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepository;

    public void addUser(UserModel userModel) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUser_id(userModel.getUser_id());
        userEntity.setFullName(userModel.getFullName());
        userEntity.setGender(userModel.getGender());
        userEntity.setAge(userModel.getAge());
        userEntity.setAppointmentDate(userModel.getAppointmentDate());
        userEntity.setEmail(userModel.getEmail());
        userEntity.setPhoneNo(userModel.getPhoneNo());
        userEntity.setDiseases(userModel.getDiseases());
        userEntity.setDoctor(userModel.getDoctor());
        userEntity.setFullAddress(userModel.getFullAddress());

        userRepository.save(userEntity);
    }

    public UserModel getUserById(int userId) {
        UserEntity userEntity = userRepository.findById(userId).orElse(null);
        return convertToModel(userEntity);
    }

    public void updateUser(int userId, UserModel userModel) {
        UserEntity userEntity = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        userEntity.setFullName(userModel.getFullName());
        userEntity.setGender(userModel.getGender());
        userEntity.setAge(userModel.getAge());
        userEntity.setAppointmentDate(userModel.getAppointmentDate());
        userEntity.setEmail(userModel.getEmail());
        userEntity.setPhoneNo(userModel.getPhoneNo());
        userEntity.setDiseases(userModel.getDiseases());
        userEntity.setDoctor(userModel.getDoctor());
        userEntity.setFullAddress(userModel.getFullAddress());

        userRepository.save(userEntity);
    }

    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }

    public List<UserModel> getAllUsers() {
        List<UserEntity> userEntities = userRepository.findAll();

        return userEntities.stream()
            .map(this::convertToModel)
            .collect(Collectors.toList());
    }

    private UserModel convertToModel(UserEntity userEntity) {
        UserModel userModel = new UserModel();
        userModel.setUser_id(userEntity.getUser_id());
        userModel.setFullName(userEntity.getFullName());
        userModel.setGender(userEntity.getGender());
        userModel.setAge(userEntity.getAge());
        userModel.setAppointmentDate(userEntity.getAppointmentDate());
        userModel.setEmail(userEntity.getEmail());
        userModel.setPhoneNo(userEntity.getPhoneNo());
        userModel.setDiseases(userEntity.getDiseases());
        userModel.setDoctor(userEntity.getDoctor());
        userModel.setFullAddress(userEntity.getFullAddress());
        return userModel;
    }
}
