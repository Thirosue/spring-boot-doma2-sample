package com.sample.domain.dto.common;

import com.sample.domain.dto.common.Dto;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
public class SessionInfo implements Serializable, Dto {

    private static final long serialVersionUID = 7593564324192730932L;

    Long id;

    String firstName;

    String lastName;

    String email;

    String tel;

    //セッションID
    String cookie;

    //ロールリスト
    List<String> roles;

    //認可リスト
    List<String> permissionKeyList;
}
