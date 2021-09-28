package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.model.Login;

public interface LoginRepo extends JpaRepository<Login, Integer>{

	public Login findByUserNameAndPassword(String userName, String password);
}
