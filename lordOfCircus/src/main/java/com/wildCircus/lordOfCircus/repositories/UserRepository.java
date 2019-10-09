package com.wildCircus.lordOfCircus.repositories;

import com.wildCircus.lordOfCircus.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}