package test.dao.impl;

import org.springframework.stereotype.Repository;
import test.dao.DepartDao;

import java.util.List;
import java.util.Map;

@Repository
public class DepartOracleImpl implements DepartDao {
    @Override
    public List<Map> select(String id) {
        System.out.println("执行Oracle操作");
        return null;
    }
}
