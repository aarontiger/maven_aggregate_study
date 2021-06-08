package cn.e3.controller;


import cn.e3.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/v1/std")
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("test")
    public String test(){
       return  testService.test();
    }
}
