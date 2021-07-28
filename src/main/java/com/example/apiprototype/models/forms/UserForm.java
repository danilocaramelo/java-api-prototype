package com.example.apiprototype.models.forms;

import com.example.apiprototype.models.User;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class UserForm {
    @NotNull @Length(min = 5)
    private String username;
    @NotNull @Length(min = 3)
    private String password;
    @NotNull @Length(min = 2)
    private String name;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User convert() {
        return new User(this.username, this.password, this.name);
    }
}
