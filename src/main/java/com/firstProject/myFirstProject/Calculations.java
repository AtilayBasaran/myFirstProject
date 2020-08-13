package com.firstProject.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message2")
public class Calculations {

    @GetMapping()
    public int calculations(){
        return 5;
    }
}
