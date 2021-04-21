package com.example.demo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author zhangyixiao
 * @date 2021/4/21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("get_and_set")
public class GetAndAdd {

    private Integer id;

    private Long targetId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
