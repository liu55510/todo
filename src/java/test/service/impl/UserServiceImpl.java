package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.dao.UserDao;
import test.entity.User;
import test.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public List<User> selectUser(String id) {
        return dao.selectUser(id);
    }
}
