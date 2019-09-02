package test.dao;

import org.apache.ibatis.annotations.Param;
import test.entity.Department;

import java.util.ArrayList;
import java.util.List;

public interface DepartmentDao {
    List<Department> queryDepartment(Department department);

    List<Department> queryDepartmentMultiParams(@Param("id") String id, @Param("name") String name);

    List<Department> dynamicIfSqlQueryDepartment(Department department);

    List<Department> dynamicChooseSqlQueryDepartment(Department department);

    List<Department> dynamicWhereSqlQueryDepartment(Department department);

    int dynamicSetSqlUpdateDepartment(Department department);

    int dynamicTrimSqlUpdateDepartment(Department department);

    List<Department> dynamicTrimWhereSqlQueryDepartment(Department department);

    List<Department> dynamicForeachSqlQueryDepartment(List<String> ids);
}
