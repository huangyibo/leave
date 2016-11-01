package com.leave.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bob on 2016/9/25.
 */

@Controller
@RequestMapping("/main")
public class IndexController {

    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }
}
