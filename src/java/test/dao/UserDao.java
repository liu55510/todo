package test.dao;

import org.springframework.stereotype.Repository;
import test.entity.User;

import java.util.List;

@Repository
public interface UserDao {
    List<User> selectUser(String id);
}
