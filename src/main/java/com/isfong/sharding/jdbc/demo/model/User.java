package com.isfong.sharding.jdbc.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@Accessors( chain = true )
public class User implements Serializable {

    private static final long serialVersionUID = -4711938764047985487L;

    private Long id;
    private String name;
    private String username;
    private String password;
}
