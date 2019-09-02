package test;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(name = "DispatchServlet",urlPatterns = {"/Dispatch.action"})
public class DispatchServlet extends javax.servlet.http.HttpServlet{
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response){

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {
        System.out.println("--进入doGet方法");
        MyBatisTest myBatisTest = new MyBatisTest();
        myBatisTest.excute();
        System.out.println("--退出doGet方法");
    }
}
