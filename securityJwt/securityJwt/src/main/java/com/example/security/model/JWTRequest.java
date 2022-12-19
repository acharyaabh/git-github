package com.example.security.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class JWTRequest
{
    private String userName;
    private String password;
}
