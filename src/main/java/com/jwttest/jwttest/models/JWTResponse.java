package com.jwttest.jwttest.models;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Builder

public class JWTResponse {

    private String jwtToken;
    private String username;
}
