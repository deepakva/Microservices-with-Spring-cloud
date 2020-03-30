package com.example.demo.controller;

import com.example.demo.model.SampleData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SampleController {

    @RequestMapping("getData")
    public SampleData getSampleData(){
        System.out.print("i am called");
        return new SampleData("Deepak",3204);
    }
}
