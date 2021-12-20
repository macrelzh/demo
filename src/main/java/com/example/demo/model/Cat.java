package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangyixiao
 * @date 2021/6/2
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cat {

    public String name;
}
