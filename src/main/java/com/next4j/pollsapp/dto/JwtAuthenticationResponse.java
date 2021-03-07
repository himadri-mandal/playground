package com.next4j.pollsapp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
public class JwtAuthenticationResponse {

    @Setter
    private String accessToken;
    private String tokenType = "Bearer";

    public JwtAuthenticationResponse(String accessToken) {
        this.accessToken = accessToken;
    }
}
