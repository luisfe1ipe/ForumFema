package br.edu.fema.forum.ForumFema.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloControler {

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello word" + " <br> " + "Luis Felipe Santos";
    }
}
