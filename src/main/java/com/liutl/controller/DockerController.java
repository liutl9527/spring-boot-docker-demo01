package com.liutl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {

    @RequestMapping("/say")
    public String say(){
        System.out.println("###########----  北京欢迎您--Docker先生！！！！！   -----###########");
        return "北京欢迎您--Docker先生！！！！！";
    }
}
