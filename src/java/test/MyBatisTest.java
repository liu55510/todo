package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import test.dao.DepartmentDao;
import test.dao.DepartmentTestMapper;
import test.entity.Department;
import test.entity.Office;
import test.entity.User;

public class MyBatisTest {
	private String name;
	private static Logger logger = Logger.getLogger(Test.class);

	public void excute() throws IOException{
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		/*User user = new User();
		user.setUsername("lei");
		user.setPassword("321555");
		User userTwo = new User();
		userTwo.setUsername("liuchun");
		userTwo.setPassword("6543");*/
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//2.寰楀埌鎵цsql鐨勫璞�
		SqlSession sqlSession = sqlSessionFactory.openSession(true);//浜嬬墿鍏抽棴
		//3.鎵цSQL璇彞
		/*List<User> params = new ArrayList<>();
		params.add(user);
		params.add(userTwo);
		sqlSession.insert("batchInsertUser",params);*/
		logger.info("日志记录：");
		/*int insertResult = 0;
		int updateResult = 0;
		try {
			insertResult = sqlSession.insert("insertUser",user);
			updateResult = sqlSession.update("updateUser",userTwo);
			sqlSession.update("xxxx");
			sqlSession.commit();
		}catch (Exception e){
			sqlSession.rollback();
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		logger.info("浜嬪姟鎵ц缁撴灉锛�"+"insertResult:"+insertResult+"--"+"updateResult:"+updateResult);*/

//		List<Map> list = sqlSession.selectList("selectUser",user);
//		int result = sqlSession.insert("insertUser",user);
//		int result = sqlSession.update("updateUser",user);
//		int result = sqlSession.delete("deleteUser",user);

		Department department = new Department();
		department.setId("2");
		department.setName("1");
//		department.setAddr("4");
//		department.setType("4");
        List<String> ids = new ArrayList<>();
        ids.add("1");
        ids.add("2");
		List<Office> result = sqlSession.selectList("DeptOfficeMapper.selectDepartment",department);
//		DepartmentDao departmentDao = sqlSession.getMapper(DepartmentDao.class);
//        DepartmentTestMapper departmentTestMapper = sqlSession.getMapper(DepartmentTestMapper.class);
//		List<Department> result = departmentDao.queryDepartment(department);
//		int result = departmentDao.dynamicTrimSqlUpdateDepartment(department);
//		List<Department> result = departmentDao.dynamicForeachSqlQueryDepartment(ids);
//        List<Department> result = departmentTestMapper.queryAllDepartment(department);
		//4.缁撴灉
//		System.out.println("鎿嶄綔缁撴灉锛�"+result);
		/*for(Map map:list){
			System.out.println(map);
		}
		for (Department list:result) {
			System.out.println(list);
		}*/
		logger.info("日志记录OK：");
		sqlSession.close();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public MyBatisTest() {

	}

	public MyBatisTest(String name) {
		this.name = name;
	}
}
