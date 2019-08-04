package life.majiang.community.controller;

/**
 * @Author zch
 * @Date 2019-07-31
 **/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){return "index";}
}
