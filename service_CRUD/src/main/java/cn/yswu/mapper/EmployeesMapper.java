package cn.yswu.mapper;

import cn.yswu.pojo.Employees;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @author yswu
 * @date 2021-07-19 22:38
 */
public interface EmployeesMapper extends BaseMapper<Employees> {

    IPage<Employees> getByGender(IPage page,Integer gender);


}
