package com.IAM.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    private int id;
    private String name;
    private String location;

    public UserResponse(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    
}

