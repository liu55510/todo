package test.dao.impl;

import org.springframework.stereotype.Repository;
import test.dao.DepartDao;
import test.entity.User;

import java.util.List;
import java.util.Map;

@Repository
public class DepartMySqlImpl implements DepartDao {
    @Override
    public List<Map> select(String id) {
        System.out.println("执行MySQL操作");
        return null;
    }
}
