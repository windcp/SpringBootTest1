package com.wind.play.web;

import com.wind.play.entity.User;
import com.wind.play.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    @ResponseBody
    public void addUser(User user, Model model){
        userService.insert(user);
    }

    @RequestMapping("/selectUser")
    @ResponseBody
    public void selectUser(int id, Model model){
        userService.selectByPrimaryKey(id);
    }

}
