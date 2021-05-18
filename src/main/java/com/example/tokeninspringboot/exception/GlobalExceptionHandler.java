package com.example.tokeninspringboot.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 钟金锋Jean
 * @date 2021/5/18 2:47
 * @description
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 用户 token 过期
     * @return
     */
    @ExceptionHandler(value = TokenAuthExpiredException.class)
    @ResponseBody
    public String tokenExpiredExceptionHandler(){
        log.warn("用户 token 过期");
        return "用户 token 过期";
    }
}
