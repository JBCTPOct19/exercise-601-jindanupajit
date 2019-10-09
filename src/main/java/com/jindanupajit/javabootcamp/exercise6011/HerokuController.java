package com.jindanupajit.javabootcamp.exercise6011;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HerokuController {

    @GetMapping(name="/", produces="text/html")
    @ResponseBody
    String HerokuHomePage() {
        return "<html><head><title>Jindanupajit - Java Boot Camp</title></head><body><h1>Exercise 601 1</h1></body></html>";
    }
}
