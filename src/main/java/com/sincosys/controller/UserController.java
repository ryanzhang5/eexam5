package com.sincosys.controller;

import com.sincosys.model.Item;
import com.sincosys.model.User;
import com.sincosys.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


@Controller
@RequestMapping("/book")
public class UserController {
    @Autowired
    public UserService userService;
    Logger logger= Logger.getLogger(UserController.class);
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private String getAllQuestions(Model model) {
        //List<Book> list = bookService.getList();
        //model.addAttribute("list", list);
        // list.jsp + model = ModelAndView
        User user = userService.getById(2);
        System.out.print("33333333333---------++++++++++++++++++++++++"+user.getUserName());
        return "index";// WEB-INF/jsp/"list".jsp
    }


    @RequestMapping(value = "/getAllItem", method = RequestMethod.GET)
    @ResponseBody
    private Item getAllQuestions2(Model model) {
        logger.debug("-------------------------------"+ (new Date()));
        return new Item("test",10);
    }
}
