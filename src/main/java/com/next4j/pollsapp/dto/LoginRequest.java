package com.next4j.pollsapp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {

    private String userNameOrEmail;

    private String password;

}
