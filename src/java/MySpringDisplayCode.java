import test.MyBatisTest;
import test.entity.Department;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MySpringDisplayCode {
    public static void main(String[] args){
        try {
            Class myBean = Class.forName("test.entity.Department");
//            Object instance = myBean.newInstance();
            Constructor constructor = myBean.getConstructor(String.class,String.class);
            Object instanceConstructor = constructor.newInstance("1","lc");
//            Method method = myBean.getMethod("setName", String.class);
//            method.invoke(instance,"lc");
            System.out.println(((Department)instanceConstructor).getId()+((Department)instanceConstructor).getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
