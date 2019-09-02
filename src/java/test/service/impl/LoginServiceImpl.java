package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.dao.LoginDao;
import test.entity.User;
import test.service.LoginService;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginDao dao;

    public LoginServiceImpl(LoginDao dao) {
        this.dao = dao;
    }

    @Override
    public List<User> selectUser(String username) {
        return dao.selectUser(username);
    }

    @Override
    public List<User> selectAllUser() {
        return dao.selectAllUser();
    }
}
