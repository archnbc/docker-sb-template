package com.huangshi.wuji.spring.scaffold.controller;

import com.huangshi.wuji.spring.scaffold.constants.DockerSBConstants;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(DockerSBConstants.API_TEST)
public class BusinessController {


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public void test(String s){
        System.out.println(s);
    }

}
