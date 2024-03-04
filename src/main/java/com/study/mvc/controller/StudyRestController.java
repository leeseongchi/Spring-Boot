package com.study.mvc.controller;

import com.study.mvc.dto.HelloDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*
* Controller명: StudentController
*
* 메소드명: getStudentInfo()
* 요청 메소드: Get
* 요청 URL: /student
* 요청 Params: name, age, phone, address
* 응답데이터: JSON(name, age, phone, address)
* */

@RestController // RestController 을 쓰면 모든 Method에 ResponseBody가 붙어있다. 그래서 html을 리턴할 수가 없고, 데이터만 리턴이 가능하다.
public class StudyRestController {

    @GetMapping("/hello/test")
    public String hello(HelloDto helloDto) {

        System.out.println(helloDto);

        return "Hello";
    }
}
