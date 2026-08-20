/*package com.IAM.service;


import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.IAM.dto.UserDto;

@Service
public class UserService {

    // In-memory data store
    private final Map<Integer, UserDto> users = Map.of(
        1, new UserDto(1, "Niranjan", "Ameenpur"),
        2, new UserDto(2, "Alice", "Hyderabad")
    );

    public Optional<UserDto> getUser(int id) {
        return Optional.ofNullable(users.get(id));
    }
}

*/