package com.sample.web.admin.controller.api.auth;

import lombok.Getter;
import lombok.Setter;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Setter
@Getter
public class LoginResource implements Serializable {

    private static final long serialVersionUID = 7593564324192730932L;

    @NotEmpty
    @Email
    String email;

    @NotEmpty
    String password;
}
