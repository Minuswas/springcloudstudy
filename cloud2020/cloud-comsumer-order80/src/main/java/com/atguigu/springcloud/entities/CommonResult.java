package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 王佳杰
 * @date 2020/4/20  13:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T> {
    private Integer code;
    private String  message;
    private T       data;

    public CommonResult (Integer code,String message){
        this(code,message,null);
    }
}
