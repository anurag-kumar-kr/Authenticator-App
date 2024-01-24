package com.anucodes.security.auth;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class RegisterRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
}
