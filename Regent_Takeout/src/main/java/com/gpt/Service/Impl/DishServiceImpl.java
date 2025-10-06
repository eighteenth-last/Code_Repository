package com.gpt.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gpt.Entity.DishEntity;
import com.gpt.Mapper.DishMapper;
import com.gpt.Service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: 程序员Eighteen
 * @CreateTime: 2025-10-06  13:18
 * @BelongsProject: Regent_Takeout
 * @Description: TODO
 * @Version: 1.0
 */
@Service
@Slf4j
public class DishServiceImpl extends ServiceImpl<DishMapper, DishEntity> implements DishService {
}
