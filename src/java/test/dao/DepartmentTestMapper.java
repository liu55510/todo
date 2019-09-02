package test.dao;

import org.apache.ibatis.annotations.Select;
import test.entity.Department;

import java.util.List;

public interface DepartmentTestMapper {
    @Select("select * from depterment where dept_name=#{name} and dept_id=#{id}")
    List<Department> queryAllDepartment(Department department);
}
