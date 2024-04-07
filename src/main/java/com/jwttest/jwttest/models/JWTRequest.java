package com.jwttest.jwttest.models;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JWTRequest {

    private String email;
    private String password;
}
