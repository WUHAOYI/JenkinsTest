package com.why.jenkinstest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WHY on 2024/9/23.
 * Functions:
 */
@RestController
public class controller {
    @GetMapping("/hello")
    public String HelloWorld()
    {
        return "hello world 123";
    }
}
