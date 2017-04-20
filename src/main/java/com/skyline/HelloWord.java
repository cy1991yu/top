package com.skyline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cy1991yu on 2017/4/15.
 */
@Controller
@EnableAutoConfiguration
public class HelloWord {


    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World,dev!!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWord.class, args);
    }
}
