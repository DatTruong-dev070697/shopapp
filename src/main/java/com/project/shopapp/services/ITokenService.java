package com.project.shopapp.services;

import com.project.shopapp.models.Token;

public interface ITokenService {
    Token saveToken(Token token);
    Token isExistToken(Long userId);
    void updateTokenByUserId(Token token);
}
