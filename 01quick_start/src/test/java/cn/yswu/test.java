package cn.yswu;

import cn.yswu.mapper.EmployeesMapper;
import cn.yswu.pojo.Employees;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author yswu
 * @date 2021-07-19 22:41
 */

@SpringBootTest
public class test {

    @Autowired
    EmployeesMapper employeesMapper;

    @Test
    void select(){
        Employees employees = employeesMapper.selectById(4);
        System.out.println(employees);
    }

    @Test
    void insert(){
        System.out.println(employeesMapper.insert(new Employees(null, "wuyusheng", "123@163.com", 1, 26)));

    }

    @Test
    void update(){

        System.out.println(employeesMapper.updateById(new Employees(5, "wuyusheng", "123@qq.com", 1, 26)));
    }

    @Test
    void delete(){
        employeesMapper.deleteById(5);
    }
}


