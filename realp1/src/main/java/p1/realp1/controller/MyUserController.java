package p1.realp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyUserController {
    @GetMapping("/home")
public String home(){
    return "index";
}
    @GetMapping("/getdata")
    public String login()
    {
		return "getdata";
    	
    }
    @GetMapping("/welcome")
    public String thanxReg() {
		return "welcome";
    	
    }
    @GetMapping("/login")
    public String loginst() {
		return "login";
    	
    }
   @GetMapping("/sucess")
    public String successful() {
		return "sucess";
    	
    }
    
}
