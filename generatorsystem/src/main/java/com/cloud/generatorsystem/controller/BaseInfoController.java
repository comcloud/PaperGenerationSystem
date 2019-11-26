package com.cloud.generatorsystem.controller;

import com.cloud.generatorsystem.model.Teacher;
import com.cloud.generatorsystem.service.BaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BaseInfoController {

    @Autowired
    private BaseInfoService baseInfoService;

    @RequestMapping("/")
    public String index(){

        return "index";
    }

    @GetMapping("/getTeacherData")
    public String getData(@RequestParam(name = "name") String name,
                          @RequestParam(name = "department") String department,
                          @RequestParam(name = "tel") String tel,
                          @RequestParam(name = "mail") String mail){
        Teacher teacher = new Teacher(name,department,tel,mail);
        baseInfoService.saveData(teacher);
        
        return "index";
    }
}
