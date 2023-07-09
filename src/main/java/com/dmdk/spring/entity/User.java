package com.dmdk.spring.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private Long phid;
    private String userName;
    private String password;

}
