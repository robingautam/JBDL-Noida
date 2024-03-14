package com.example.gfg.JBDLL11;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {

    @RequestMapping("/hello2")
    public String hello2(){
        return "hello 2";
    }
}
