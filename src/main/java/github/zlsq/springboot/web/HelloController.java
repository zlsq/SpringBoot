package github.zlsq.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author zlsq
 * @date 2017/11/13
 */
//此处不能使用@RestController,否则不能返回jsp页面
//@RestController = @ResponseBody ＋ @Controller
@Controller
public class HelloController {

    @Value("${application.hello:Hello,Man}")
    private String hello;

    @RequestMapping("/1")
    public String hello(Map<String, Object> model) {
        model.put("hello", hello);
        return "hello";
    }


}
