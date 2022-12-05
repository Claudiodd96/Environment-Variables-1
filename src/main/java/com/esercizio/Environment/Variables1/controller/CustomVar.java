package com.esercizio.Environment.Variables1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomVar {

    @Autowired
    private Environment environment;


    @GetMapping("/var")
    public String getVar1(){
        String str =environment.getProperty("authCode.customVar");
        String str1= environment.getProperty("devName.customVar");
        return "Benvenuto " + str1 + " " +  str;
    }
}
