package com.isfong.sharding.jdbc.demo.controller;

import com.isfong.sharding.jdbc.demo.model.User;
import com.isfong.sharding.jdbc.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping( "users" )
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public String users( ) {
        return "users";
    }

    @ResponseBody
    @GetMapping( "list" )
    public List< User > list( ) {
        return userService.list( );
    }
}
