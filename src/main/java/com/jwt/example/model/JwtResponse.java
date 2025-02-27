package com.jwt.example.model;

import lombok.*;

@Builder
public class JwtResponse {

    private String jwtToken;
    private String userName;

    public void JwtResponse(){

    }
    public JwtResponse(String jwtToken, String userName) {
        this.jwtToken = jwtToken;
        this.userName = userName;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "JwtResponse{" +
                "jwtToken='" + jwtToken + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
