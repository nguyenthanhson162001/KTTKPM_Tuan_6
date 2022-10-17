package net.guides.springboot2.springboot2jpacrudexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.guides.springboot2.springboot2jpacrudexample.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String username);
}
