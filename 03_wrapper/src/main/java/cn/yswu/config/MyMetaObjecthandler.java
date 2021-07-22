package cn.yswu.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author yswu
 * @date 2021-07-22 15:24
 */

@Component
public class MyMetaObjecthandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {

        this.setFieldValByName("createDate",new Date(),metaObject);
        this.setFieldValByName("modifyDate",new Date(),metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {

        this.setFieldValByName("modifyDate",new Date(),metaObject);


    }
}
