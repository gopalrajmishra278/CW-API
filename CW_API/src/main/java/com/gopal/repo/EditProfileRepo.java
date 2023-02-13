package com.gopal.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gopal.entity.EditProfileEntity;

public interface EditProfileRepo extends JpaRepository<EditProfileEntity, Serializable>{

}
