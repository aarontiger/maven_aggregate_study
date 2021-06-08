package cn.e3.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class TestService {
    @GetMapping("test")
    public String test(){
        return "hello world";
    }
}
