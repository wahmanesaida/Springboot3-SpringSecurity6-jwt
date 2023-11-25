package com.testingSecurit.demo.Service;

import com.testingSecurit.DAO.SignUpRequest;
import com.testingSecurit.DAO.SigninRequest;
import com.testingSecurit.DAO.Response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
