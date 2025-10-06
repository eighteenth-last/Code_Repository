package com.gpt.Common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;


/**
 * @Author: 程序员Eighteen
 * @CreateTime: 2025-10-05  12:09
 * @BelongsProject: Regent_Takeout
 * @Description: TODO
 * @Version: 1.0
 */

@Component
@Slf4j
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {

        // 插入自动填充
        log.info("----------公共字段自动填充【insert】----------");
        log.info(metaObject.toString());

        metaObject.setValue("createTime", new Date());
        metaObject.setValue("updateTime", new Date());
        metaObject.setValue("createUser", BaseContextCommon.getCurrentUserId());
        metaObject.setValue("updateUser", BaseContextCommon.getCurrentUserId());
    }

    // 更新自动填充
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("----------公共字段自动填充【update】----------");
        log.info(metaObject.toString());

        long id = Thread.currentThread().getId();
        log.info("线程id为{}:",id);

        metaObject.setValue("updateTime", new Date());
        metaObject.setValue("updateUser", BaseContextCommon.getCurrentUserId());
    }
}