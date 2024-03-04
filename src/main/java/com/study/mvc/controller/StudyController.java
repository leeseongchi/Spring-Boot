package com.study.mvc.controller;

import com.study.mvc.model.HelloModel;
import lombok.Builder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller // 서블릿을 연결한다.
public class StudyController {

    // MVC
    @GetMapping("/hello2")
    public ModelAndView helloPage(Model model) {
        model.addAttribute("name1", "김준일");
        model.addAttribute("name2", "김준이");
        model.addAttribute("name3", "김준삼");
        return new ModelAndView("hello");
    }

    // 매개변수로 model을 받지않고 Map을 써서 쓸 수도 있다.
//    @GetMapping("/hello")
//    public ModelAndView helloPage() {
//        Map<String, Object> model = new HashMap<>();
//        model.put("name1", "김준일");
//        model.put("name2", "김준이");
//        model.put("name3", "김준삼");
//        return new ModelAndView("hello", model);
//    }

    @GetMapping("/hello")
    public String helloPage2(Model model) {
        HelloModel helloModel = HelloModel.builder()
                .name1("김준일")
                .name2("김준이")
                .name3("김준삼")
                .build();
        model.addAttribute("h", helloModel);
        return "hello";
    }

    // REST
    @GetMapping("/test") // return 을 html 파일명으로 한다.
    @ResponseBody // return 값을 데이터로 받는다.
    public Map<String, Object> testPage(Model model) {
        Map<String, Object> testObj = new HashMap<>();
        testObj.put("age", 32);
        return testObj;
    }
}
