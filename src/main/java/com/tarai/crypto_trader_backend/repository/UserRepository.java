package com.tarai.crypto_trader_backend.repository;

import com.tarai.crypto_trader_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
        User findByEmail(String email);
}
