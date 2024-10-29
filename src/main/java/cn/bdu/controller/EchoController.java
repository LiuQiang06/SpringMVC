package cn.bdu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author LiuQiang
 * @Date 2024/05/23 星期四 10:18
 * @Description
 */
@Controller
public class EchoController {
    @GetMapping("/echo")
    public String echo(Model model, @RequestParam("msg") String msg) {
        model.addAttribute("msg", msg);
        return "echo";
    }

    public void method(){
        System.out.println("我是main主干");
    }

    public void test() {
        System.out.println("我是test分支");
    }

    public void test2() {
        System.out.println("我是test分支 二次提交");
    }

}
