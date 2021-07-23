package cn.yswu.tbl.service.impl;

import cn.yswu.tbl.entity.Employee;
import cn.yswu.tbl.mapper.EmployeeMapper;
import cn.yswu.tbl.service.EmployeeImplService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yswu
 * @since 2021-07-23
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeImplService {

}
