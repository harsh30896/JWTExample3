package com.jwt.example.model;


import lombok.*;


@Builder

public class JwtRequest {

    private String email;
    private String password;

    public void JwtResponse(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public JwtRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "JwtRequest{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
