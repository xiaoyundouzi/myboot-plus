package com.myboot.plus.response;

import lombok.Data;

/**
 * @Author: zyf
 * @Date: 2025/2/7 11:28
 * @Description: 统一响应格式
 */
@Data
public class ResponseDTO<T>{
    private int status;
    private String message;
    private T data;
}
