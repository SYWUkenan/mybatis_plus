package cn.yswu;

import cn.yswu.pojo.Employees;
import cn.yswu.service.EmployeesService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;

/**
 * @author yswu
 * @date 2021-07-22 10:30
 */

@SpringBootTest
public class wrapperTest {

    @Autowired
    EmployeesService employeesService;

    @Test
    void test(){


        QueryWrapper<Employees> wrapper = new QueryWrapper<>();
        wrapper.lambda()
                .select(Employees::getLastName,Employees::getAge)
                .eq(Employees::getLastName,"Tom");
        employeesService.list(wrapper);
    }

    @Test
    void test02(){


        QueryWrapper<Employees> wrapper = new QueryWrapper<>();
        wrapper.lambda()
                .between(Employees::getAge,25,30);
        employeesService.list(wrapper);
    }

    @Test
    void test03(){
        UpdateWrapper<Employees> updateWrapper = new UpdateWrapper<>();

        updateWrapper.lambda()
                .set(Employees::getLastName,"wuyusheng")
                .eq(Employees::getId,4);

        employeesService.update(updateWrapper);
    }

    @Test
    void logicDelete(){
        employeesService.removeById(4);
    }

    @Test
    void logicList(){
        employeesService.list();
    }


    @Test
    void insertAndUpdate(){
        employeesService.saveOrUpdate(new Employees(3, "yswu", "123@qq.com", 0, 26));
    }
}
