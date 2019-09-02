package test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.dao.DepartDao;
import test.dao.DepartmentDao;
import test.dao.UserDao;
import test.service.DepartService;
import test.service.UserService;

public class SpringTest {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
//        MyBatisTest test = (MyBatisTest) context.getBean("MyBatisTest");
//        Object instance = context.getBean("department");
//        MySpringOperation mySpringOperation = (MySpringOperation) context.getBean("lowerOperation");
//        System.out.println(mySpringOperation.operaed("Lc"));
//        DepartService test = (DepartService)context.getBean("departServiceImpl");
//        test.selectFrom("1");
        BusinessTest test = (BusinessTest)context.getBean("businessTest");
        test.test("lc");
//        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        UserDao userDao = sqlSession.getMapper(UserDao.class);
//        userDao.selectUser("1");
//        UserService userService = (UserService) context.getBean("userServiceImpl");
//        userService.selectUser("1");
//        try {
//            test.excute();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }
}
