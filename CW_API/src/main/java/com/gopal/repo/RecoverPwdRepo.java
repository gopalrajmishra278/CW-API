package com.gopal.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gopal.entity.RecoverPwdEntity;

public interface RecoverPwdRepo extends JpaRepository<RecoverPwdEntity, Serializable>{

}
