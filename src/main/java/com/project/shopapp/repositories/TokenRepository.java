package com.project.shopapp.repositories;

import com.project.shopapp.models.Token;
import com.project.shopapp.models.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;


@Repository
public interface TokenRepository extends JpaRepository<Token,Long> {

    @Query(
            value = "select u.* from tokens u where u.user_id=?1",
            nativeQuery = true
    )
    Token findTokenByUserId(Long userId);
    Token findTokenById(Long id);
    @Modifying
    @Transactional
    @Query(
            value = "update tokens set expiration_date=?1, expired=?2, revoked=?3, token=?4, token_type=?5, user_id=?6 where id=?7",
            nativeQuery = true
    )
    void updateTokenById(LocalDateTime expirationDate, boolean expired, boolean revoked, String token, String tokenType, Long userId, Long id);
}
