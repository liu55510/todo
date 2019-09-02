package test.service;

import test.entity.User;

import java.util.List;

public interface UserService {
    List<User> selectUser(String id);

}
