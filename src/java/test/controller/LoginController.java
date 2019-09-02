package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import test.entity.User;
import test.service.LoginService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes("user")
public class LoginController {
    @Autowired
    LoginService service;


    @RequestMapping("/userLogin")
    public String firstPage(){
//        return "/WEB-INF/jsp/index.jsp";
        return "login";
    }

    @RequestMapping("/login")
    public ModelAndView showLogin(String username, String password, Model model){
        /*HttpSession session*/
        /*HttpServletRequest request*/
        //HttpSession session = request.getSession();
        List<User> users = service.selectUser(username);
        String nextView = "welcom";
        Map<String,String> nextViewParam = new HashMap<>();
        if(users == null||users.isEmpty()){
            nextView = "error";
            nextViewParam.put("error","用户名不存在");
        }else {
            User user = users.get(0);
            if(!user.getPassword().equals(password)){
                nextView = "error";
                nextViewParam.put("error","密码不正确");
            }else {
                nextViewParam.put("username",username);
//                session.setAttribute("user",user);
                model.addAttribute("user",user);
            }
        }
        ModelAndView modelAndView = new ModelAndView(nextView);
        modelAndView.addAllObjects(nextViewParam);
        return modelAndView;
    }

    @RequestMapping("/check")
    @ResponseBody
    public Map checkUser(String username){
        Map<String,Integer> result=new HashMap<>();
        List<User> users=service.selectUser(username);
        if (users==null||users.isEmpty()){
            result.put("check",0);
        }else {
            result.put("check",1);
        }
        return result;
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public Object getUser(@SessionAttribute(value = "user",required = false)User user){
        /*HttpServletRequest request*/
//        HttpSession session = request.getSession();
        return user;
    }

    @RequestMapping("/getAllUser")
    public ModelAndView getAllUser(){
        ModelAndView modelAndView = new ModelAndView("allUser");
        List<User> users = service.selectAllUser();
        modelAndView.addObject("allUser",users);
        return modelAndView;
    }

    @RequestMapping("logout")
    public ModelAndView logout(HttpSession session){
        session.setAttribute("user",null);
        ModelAndView modelAndView = new ModelAndView("login");
        return  modelAndView;
    }
}
