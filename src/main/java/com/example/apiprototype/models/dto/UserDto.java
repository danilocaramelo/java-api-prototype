package com.example.apiprototype.models.dto;

import com.example.apiprototype.models.User;
import org.springframework.data.domain.Page;

public class UserDto {

    private Long id;
    private String username;
    private String name;
    //TODO incluir no DTO a lista de perfis.

    public UserDto(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.name = user.getName();
    }

    public static Page<UserDto> convert(Page<User> users) {
        return users.map(UserDto::new);
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getName() {
        return name;
    }
}
