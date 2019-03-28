package com.xiaoqi.cloud.controller;

import com.xiaoqi.cloud.bean.User;
import com.xiaoqi.cloud.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author xiaoqi
 * 2019-03-18
 */
@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) {
        System.out.println("调用服务端口： " + port);
        return this.userRepository.findById(id);
    }
}
