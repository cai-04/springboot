package nuc.edu.cai4.springmvc.Controller;

import nuc.edu.cai4.springmvc.entity.Book;
import nuc.edu.cai4.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.List;

@Controller
@RequestMapping(value = "/book")
public class BookController {
    // 注入书籍服务类
    @Autowired
    private BookService bookService = null;
    //测试jsp
    @RequestMapping(value = "/hello")
    public String index(Model model) {
        model.addAttribute("message", "cai4");

        return "hello";
    }

    /*
     * 打开请求页面
     * return 字符串，指向页面
     */
    @GetMapping(value = "/add")
    public String add() {
        return "add";
    }
    /*
     * 新增书籍
     *@param book 通过@RequestBody注解得到JSON参数
     *return 返回书籍信息
     */
    @PostMapping(value = "/insert")
    @ResponseBody
    public Book insert(@RequestBody Book book) {
        bookService.insertBook(book);
        return book;
    }
    //显示数据 http://localhost:3000/book/list
    @RequestMapping(value = "/list")
    @ResponseBody
    public List<Book> list(){
        //访问模型层得到数据
        List<Book> books = bookService.showBookAll();
        return books;
    }
    //显示数据 http://localhost:3000/book/details
    @RequestMapping(value = "/details1")
    public ModelAndView table0() {
//访问模型层得到数据
        List<Book> book= bookService.showBookAll();
//模型和视图
        ModelAndView mv=new ModelAndView();
//定义模型视图

        mv.setViewName("/details1");
//加入数据模型
        mv.addObject("book", book);
//返回模型和视图
        return mv;
    }

// 按 id 查询显示结果, 展示用户详情 ,展示结果 Json 格式
// URL 地址： http://localhost:3000/book/detailsForJson?b_id=3
    @RequestMapping(value = "/detailsForJson")
    public ModelAndView detailsForJson(Integer b_id)
    {
// 访问模型层得到数据
        Book book = bookService.showBookById(b_id);
// 模型和视图
        ModelAndView mv = new ModelAndView();
// 生成 JSON 视图
        MappingJackson2JsonView jsonView = new MappingJackson2JsonView();
        mv.setView(jsonView);
// 加入模型
        mv.addObject("book", book);
        return mv;
    }
    // 按 id 查询显示结果, 展示用户详情，展示结果 jsp 视图
// URL 地址： http://localhost:3000/book/details1?b_id=3
    @RequestMapping(value = "/details")
    public ModelAndView details(Integer b_id) {
// 访问模型层得到数据
        Book book = bookService.showBookById(b_id);
// 模型和视图
        ModelAndView mv = new ModelAndView();
// 定义模型视图
// 视 图 路 径 ： application.property 文 件 中 设 置
 //       spring.mvc.view.prefix=/
// 视图名称: book/details.jsp
        mv.setViewName("/details");
// 加入数据模型
        mv.addObject("book", book);
// 返回模型和视图
        return mv;
    }
}
