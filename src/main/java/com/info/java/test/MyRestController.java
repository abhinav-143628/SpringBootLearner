package com.info.java.test;

import com.info.java.other.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abhdogra1 on 12/27/2018.
 */
@RestController
public class MyRestController {

    @Autowired
    Hello hel;

    @GetMapping("/print")
    public String getPrintMessage(){
        hel.print();
        return "hello";
    }
}
