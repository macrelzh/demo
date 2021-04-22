package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.model.GetAndAdd;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GetAndAddDao extends BaseMapper<GetAndAdd> {
    int deleteByPrimaryKey(Integer id);

    @Override
    int insert(GetAndAdd record);

    int insertSelective(GetAndAdd record);

    GetAndAdd selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GetAndAdd record);

    int updateByPrimaryKey(GetAndAdd record);
}