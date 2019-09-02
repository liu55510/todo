package test.dao;

import org.springframework.stereotype.Repository;
import test.entity.User;

import java.util.List;

//@Repository
public interface LoginDao {
    List<User> selectUser(String username);
    List<User> selectAllUser();
}
