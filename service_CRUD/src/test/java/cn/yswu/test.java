package cn.yswu;

import cn.yswu.pojo.Employees;
import cn.yswu.service.EmployeesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

/**
 * @author yswu
 * @date 2021-07-19 23:55
 */

@SpringBootTest
public class test {

    @Autowired
    EmployeesService employeesService;

    @Test
    void query(){
        System.out.println(employeesService.getById(3));
    }

    @Test
    void saveOrUpdate(){
        System.out.println(employeesService.saveOrUpdate(new Employees(9, "wuyusheng", "123@qq.com", 1, 26)));
    }

    @Test
    void removeByIds(){

        List<Integer> list = Arrays.asList(6,7,8);

        System.out.println(employeesService.removeByIds(list));
    }

    @Test
    void listByids(){
        List<Integer> list = Arrays.asList(2,3,4);
        System.out.println(employeesService.listByIds(list));
    }


}
