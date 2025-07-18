package com.example.security.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import com.example.security.jwt.domain.RefreshToken;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken,Long> {

    Optional<RefreshToken> findByToken(String Token);

    void deleteByToken(String Token);

    void deleteByKeyEmail(String keyEmail);          // 🔷 추가

    boolean existsByKeyEmail(String keyEmail);
}
