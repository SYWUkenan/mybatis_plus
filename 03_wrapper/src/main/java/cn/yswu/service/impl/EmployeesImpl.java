package cn.yswu.service.impl;

import cn.yswu.mapper.EmployeesMapper;
import cn.yswu.pojo.Employees;
import cn.yswu.service.EmployeesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author yswu
 * @date 2021-07-19 23:50
 */

@Service
public class EmployeesImpl extends ServiceImpl<EmployeesMapper, Employees> implements EmployeesService {
}
