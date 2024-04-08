package com.project.shopapp.services;

import com.project.shopapp.models.Token;
import com.project.shopapp.repositories.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenService implements  ITokenService{
    @Autowired
    private TokenRepository tokenRepository;
    @Override
    public Token saveToken(Token token) {
        tokenRepository.save(token);
        return tokenRepository.findTokenById(token.getId());
    }

    @Override
    public Token isExistToken(Long userId) {
        return tokenRepository.findTokenByUserId(userId);
    }

    @Override
    public void updateTokenByUserId(Token token) {
        tokenRepository.updateTokenById(token.getExpirationDate(),token.isExpired(),
                token.isRevoked(),token.getToken(),token.getTokenType(),token.getUserId().getId(),token.getId());
    }

}
