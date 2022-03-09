package com.Pluto.E_Commerce_Platform.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Hoaer
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultOV {
    /**
     * code:响应给前端的状态码
     * message:响应给前端的提示信息
     * data:响应给前端的数据
     */
    private int code;
    private Object message;
    private Object data;
}
