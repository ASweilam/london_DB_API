package com.asweilam.londonv2.repositories;

import com.asweilam.londonv2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
