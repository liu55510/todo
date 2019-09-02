package test.dao;

import test.entity.User;

import java.util.List;
import java.util.Map;

public interface DepartDao {
    List<Map> select(String id);
}
