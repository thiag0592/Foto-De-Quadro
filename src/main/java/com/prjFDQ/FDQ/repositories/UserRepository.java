package com.prjFDQ.FDQ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjFDQ.FDQ.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
