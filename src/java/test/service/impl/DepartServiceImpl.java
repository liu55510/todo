package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import test.dao.DepartDao;
import test.service.DepartService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

//@Service
public class DepartServiceImpl implements DepartService {
//    @Qualifier("departOracleImpl")

    //    @Resource(name = "departMySqlImpl")

    DepartDao dao;
//    @Resource
//    DepartDao departOracleImpl;

//    public void setDao(DepartDao dao) {
//        this.dao = dao;
//    }

    @Override
    public List<Map> selectFrom(String id) {
        return dao.select(id);
    }
}
