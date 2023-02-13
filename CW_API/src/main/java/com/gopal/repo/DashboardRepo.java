package com.gopal.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gopal.entity.DashboardDisplayEntity;

public interface DashboardRepo extends JpaRepository<DashboardDisplayEntity, Serializable> {

}
