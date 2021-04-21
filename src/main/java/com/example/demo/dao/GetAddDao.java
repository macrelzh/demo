package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.model.GetAndAdd;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author zhangyixiao
 * @date 2021/4/21
 */
@Mapper
@Repository
public interface GetAddDao extends BaseMapper<GetAndAdd> {

}