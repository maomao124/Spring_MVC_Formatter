package mao.spring_mvc_formatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Project name(项目名称)：Spring_MVC_Formatter
 * Package(包名): mao.spring_mvc_formatter
 * Class(类名): MyController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/9
 * Time(创建时间)： 12:46
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Controller
public class MyController
{
    @RequestMapping("test1")
    public String test1(User user, Model model)
    {
        model.addAttribute("user",user);
        return "show";
    }

    @RequestMapping("test")
    public String test()
    {
        return "addUser";
    }
}
