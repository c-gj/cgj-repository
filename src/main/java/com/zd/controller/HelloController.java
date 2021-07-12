package com.zd.controller;

import com.zd.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
@RequestMapping("/java")
    public String java(@RequestParam(value = "id",required = false) Integer uid,
                       @RequestParam ("name")String name,
                       @RequestParam("pwd") String pwd){
        System.out.println(uid);
        System.out.println(name);
        System.out.println(pwd);
        return "java";
    }
    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login(User user){
        System.out.println(user);
        return "userInfo";
    }

    //@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @GetMapping("/user/{id}")
    @ResponseBody
    public String userInfo(@PathVariable("id") Integer uid){
        System.out.println(uid);
        return "userInfo";
    }
    //@RequestMapping(value = "/user/{id}", method = RequestMethod.POST)
    @PostMapping("/user/{id}")
    public String post(@PathVariable("id") Integer uid){
        System.out.println(uid);
        return "userInfo";
    }
    //@RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    @PutMapping("/user/{id}")
    public String put(@PathVariable("id") Integer uid){
        System.out.println(uid);
        return "userInfo";
    }
    //@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable("id") Integer uid){
        System.out.println(uid);
        return "userInfo";
    }
}
