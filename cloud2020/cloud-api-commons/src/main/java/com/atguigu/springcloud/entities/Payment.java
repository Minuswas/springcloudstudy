package com.atguigu.springcloud.entities;

/**
 * @author 王佳杰
 * @date 2020/4/20  13:16
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 王佳杰
 * @date 2020/4/20  12:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}