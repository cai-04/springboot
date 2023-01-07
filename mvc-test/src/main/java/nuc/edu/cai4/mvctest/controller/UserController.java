package nuc.edu.cai4.mvctest.controller;

import nuc.edu.cai4.mvctest.entity.User;
import nuc.edu.cai4.mvctest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    // 注入用户服务类
    @Autowired
    private IUserService IUserService = null;

    //测试thymeleaf
    //URL:http://127.0.0.1:3000/user/hello
    @RequestMapping(value = "/hello")
    public String index(Model model) {
        model.addAttribute("name", "cai4");
        return "index";
    }

    /*
     * 打开请求页面
     * return 字符串，指向页面
     */
    //URL:http://127.0.0.1:3000/user/add
    @GetMapping(value = "/add")
    public String add() {
        return "add";
    }

    /*
     * 新增用户
     *@param user 通过@RequestBody注解得到JSON参数
     *return 返回用户信息
     */
    @PostMapping(value = "/insert")
    @ResponseBody
    public User insert(@RequestBody User user) {
        IUserService.insertUser(user);
        return user;
    }

    //显示数据 URL:http://127.0.0.1:3000/user/list
    @RequestMapping(value = "/list")
    @ResponseBody
    public List<User> list(){
        //访问模型层得到数据
        List<User> users = IUserService.showUserAll();
        return users;
    }

    //显示数据 URL:http://127.0.0.1:3000/user/details
    @RequestMapping(value = "/details1")
    public ModelAndView table0() {
    //访问模型层得到数据
        List<User> user = IUserService.showUserAll();
    //模型和视图
        ModelAndView mv=new ModelAndView();
    //定义模型视图

        mv.setViewName("/details1");
    //加入数据模型
        mv.addObject("user", user);
    //返回模型和视图
        return mv;
    }

    // 按 id 查询显示结果, 展示用户详情 ,展示结果 Json 格式
    // URL 地址： http://127.0.0.1:3000/user/detailsForJson?id=3
    @RequestMapping(value = "/detailsForJson")
    public ModelAndView detailsForJson(Integer id)
    {
    // 访问模型层得到数据
        User user = IUserService.showUserById(id);
    // 模型和视图
        ModelAndView mv = new ModelAndView();
    // 生成 JSON 视图
        MappingJackson2JsonView jsonView = new MappingJackson2JsonView();
        mv.setView(jsonView);
    // 加入模型
        mv.addObject("user", user);
        return mv;
    }

    // 按 id 查询显示结果, 展示用户详情，展示结果 html 视图
    // URL 地址： http://127.0.0.1:3000/user/details1?id=3
    @RequestMapping(value = "/details")
    public ModelAndView details(Integer id) {
    // 访问模型层得到数据
        User user = IUserService.showUserById(id);
    // 模型和视图
        ModelAndView mv = new ModelAndView();
    // 定义模型视图
        mv.setViewName("/details");
    // 加入数据模型
        mv.addObject("user", user);
    // 返回模型和视图
        return mv;
    }

    // 按 userName,note多条件查询显示结果, 展示用户详情，展示结果 html 视图
    // URL 地址： http://127.0.0.1:3000/user/detailsn?userName=user_name_3&note=note_3
    @RequestMapping(value = "/detailsn")
    public ModelAndView details(String userName, String note) {
    // 访问模型层得到数据
        User user = IUserService.showUserByNn(userName,note);
    // 模型和视图
        ModelAndView mv = new ModelAndView();
    // 定义模型视图
        mv.setViewName("/detailsn");
    // 加入数据模型
        mv.addObject("user", user);
    // 返回模型和视图
        return mv;
    }

    //通过 URL 传递参数
    //URL:http://127.0.0.1:3000/user/1
    //{...} 代表占位符，还可以配置参数名称
    @GetMapping("/{id}")
    //相应为JSON数据集
    @ResponseBody
    //@PathVariable 通过参数名称获取参数
    public User get(@PathVariable("id") Integer id) {
        return IUserService.showUserById(id);
    }

    //获取格式化参数
    //URL：http://127.0.0.1:3000/user/form
    @RequestMapping("/form")
    public String showFormat() {
        return "/formatter";
    }
    //获取提交参数
    @PostMapping("/commit")
    @ResponseBody
    public Map<String, Object> format(
            @DateTimeFormat(iso= DateTimeFormat.ISO.DATE) Date date,
            @NumberFormat(pattern="#,###.###") Double number
    ){
        Map<String, Object> dataMap=new HashMap();
        dataMap.put("date", date);
        dataMap.put("number", number);
        return dataMap;
    }
    }

