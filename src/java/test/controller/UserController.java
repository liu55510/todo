package test.controller;

import com.sun.xml.internal.ws.client.sei.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import test.entity.User;
import test.service.UserService;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.spi.http.HttpHandler;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping(path = "",method = RequestMethod.POST)
    public String firstPage(){
//        return "/WEB-INF/jsp/index.jsp";
        return "index";
    }

    @RequestMapping(path = "",method = RequestMethod.GET)
    public String firstPageTwo(){
//        return "/WEB-INF/jsp/index.jsp";
        return "index";
    }

    @RequestMapping("/login")
    public String userLogin(String userName){
        System.out.println(userName);
        return "usercenter";
    }

    @RequestMapping("/{userName}")
    public String userLoginWithPara(@PathVariable("userName")String name){
        System.out.println(name);
        return "usercenter";
    }

    @RequestMapping("/entity")
    public String userLoginWithEntity(User user){
        System.out.println(user.getUsername());

        return "usercenter";
    }

    //
    @RequestMapping("/request")
    public String userLoginWithRequest(HttpServletRequest request){
        String name = request.getParameter("userName");
        System.out.println(name);

        request.setAttribute("userName",name);
        return "usercenter";
    }

    @RequestMapping("/model")
    public String userLoginWithModel(String userName, Model model){
        model.addAttribute("userName",userName);
        return "usercenter";
    }

    @RequestMapping("/modelmap")
    public String userLoginWithModelMap(String userName, ModelMap model){
        model.addAttribute("userName",userName);
        return "usercenter";
    }

    @RequestMapping("/modelandview")
    public ModelAndView userLoginWithModelAndView(String userName){
        ModelAndView view = new ModelAndView("usercenter");
        view.addObject("userName",userName);
        return view;
    }

//    @RequestMapping("/json")
//    @ResponseBody
//    public Map userLoginJsonData(String userName){
//        Map<String,Object> param = new HashMap<>();
//        param.put("userName",userName);
//        return param;
//    }

    @RequestMapping(path = "/json")
    @ResponseBody
    public User userLoginJsonDataTwo(String userName){
        User param = new User();
        param.setId("1");
        param.setUsername(userName);
        param.setPassword("123456");
        return param;
    }

    //上传文件
    @RequestMapping("/file/upload")
    public ModelAndView uploadFile(@RequestParam(value = "files",required = true) MultipartFile file, HttpServletRequest request){
        String filename = file.getOriginalFilename();
        //获取文件保存到服务器上的地址
        String fileRelationPath = "/upload/" + filename;
        String path = request.getSession().getServletContext().getRealPath("")+fileRelationPath;
        File f = new File(path);
        //判断upload文件夹是否存在，如果不存在则创建
        if (!f.getParentFile().exists()){
            f.getParentFile().mkdirs();
        }
        //将上传的文件传输到指定路径
        try {
            file.transferTo(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //返回视图
        ModelAndView mv = new ModelAndView("usercenter");
        mv.addObject("filename",filename);//将文件名传递到下一个页面
//        mv.addObject("fileDownLoadPath",
//                request.getContextPath()+fileRelationPath);
        mv.addObject("fileDownLoadPath",request.getContextPath()+"/user/file/download/?fileName="+filename);
        return  mv;
    }

    @RequestMapping("/file/download")
    public ResponseEntity<byte[]> downLoadFile(String fileName, HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServletContext servletContext = request.getSession().getServletContext();
        InputStream in = servletContext.getResourceAsStream("/upload/" + fileName);
        //设置下载页面的内容：将字节码
        byte[] body = new byte[in.available()];
        in.read(body);
        //
        HttpHeaders headers = new HttpHeaders();
        String userAgent = request.getHeader("User-Agent").toLowerCase();
        //解决文件名称中文乱码问题
        if(userAgent.contains("chrome")&!userAgent.contains("safari")){
            fileName = new String(fileName.getBytes("UTF-8"),"ISO-8859-1");
        }else {
            fileName = URLEncoder.encode(fileName,"utf-8");
        }
        headers.add("Content-Disposition",String.format("attachment;filename=\"%s\"",fileName));

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .body(body);
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public List<User> getUsers(String id){
        return service.selectUser(id);
    }
}
