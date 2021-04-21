package com.example.demo.service.impl;

import com.example.demo.dao.GetAddDao;
import com.example.demo.model.GetAndAdd;
import com.example.demo.service.GetAndSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangyixiao
 * @date 2021/4/21
 */
@Service
public class GetAndSetImpl implements GetAndSetService {

    @Autowired
    GetAddDao getAddDao;


    @Override
    public Long getAndSet() {
        // 获取当前值
        GetAndAdd origin = getAddDao.selectById(1);

        // 自增并更新
        getAddDao.updateById(
                GetAndAdd.builder()
                        .id(1)
                        .targetId(origin.getTargetId() + 1)
                        .build()
        );
        return origin.getTargetId() + 1;
    }
}
