package com.example.tokeninspringboot.controller;

import com.example.tokeninspringboot.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author 钟金锋Jean
 * @date 2021/5/18 2:46
 * @description
 */

@RestController
public class TokenTestController {
    @Autowired
    TokenUtil tokenUtil;
    /**
     * 使用 /login 请求获得 token, /login 不经过拦截器
     */
    @GetMapping("/login")
    public String login(){
        return tokenUtil.getToken("jean","user");
    }

    /**
     * 使用 /test-token 测试 token，进过拦截器
     */
    @PostMapping("/test-token")
    public Map testToken(HttpServletRequest request){
        String token = request.getHeader("token");
        return tokenUtil.parseToken(token);
    }

}
