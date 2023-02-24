package com.kjlc.app.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserPojo {

    Long userID;

    String Role;

    @NotEmpty(message = "Email can't be empty")
    String email;

    @NotEmpty(message = "Password can't be empty")
    String password;
}
