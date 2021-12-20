package com.example.demo;

import com.baomidou.mybatisplus.core.toolkit.BeanUtils;
import com.example.demo.model.Cat;
import com.example.demo.model.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.ObjectUtils;

import java.util.*;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        Dog dog = Dog.builder().name("do1").build();
        Dog dog2 = Dog.builder().name("do2").build();
        Object d1 = dog;
        Object d2 = dog2;
        System.out.println(d1.equals(d2));
//        Cat cat = Cat.builder().build();
//
//        System.out.println(dog);
//
//        Map<String, Object> dogMap = BeanUtils.beanToMap(dog);
//        Map<String, Object> dogMap2 = BeanUtils.beanToMap(dog2);
//
//
//        Set<String> ignoreFields = new HashSet<>();
//
//        dogMap2.forEach((k, v) -> {
//            // 未更新的字段不需要更新提示
//            if (!ObjectUtils.isEmpty(v) && v.equals(dogMap.get(k))) {
//                ignoreFields.add(k);
//                System.out.println("key:" + k);
//            }
//        });
//        org.springframework.beans.BeanUtils.copyProperties(
//                dogMap2, cat, ignoreFields.toArray(new String[0]));
//
//        System.out.println(cat);
//        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
//        List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT * FROM get_and_set");
//        System.out.println(result);
    }

}
