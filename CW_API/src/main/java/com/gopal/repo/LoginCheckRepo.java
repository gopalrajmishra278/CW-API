package com.gopal.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gopal.entity.LoginCheckEntity;

public interface LoginCheckRepo extends JpaRepository<LoginCheckEntity, Serializable>{

}
