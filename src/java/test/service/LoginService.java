package test.service;

import org.springframework.stereotype.Repository;
import test.entity.User;

import java.util.List;


public interface LoginService {
    List<User> selectUser(String username);
    List<User> selectAllUser();
}
