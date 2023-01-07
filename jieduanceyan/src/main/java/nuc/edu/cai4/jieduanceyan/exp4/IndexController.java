package nuc.edu.cai4.jieduanceyan.exp4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
@RequestMapping("/")
    //Spring MVC会自动生成视图，并且绑定数据模型
    public String index(Model model) {
        System.out.println("IndexController index方法被调用。。。。");
        return "index";
    }
}
