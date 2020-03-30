package com.example.demo.controller;

import com.example.demo.model.SampleData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class SampleController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("recieveData")
    public SampleData getSampleData(){
        //If not using Eureka server and just calling another endpoint use below
        //SampleData sampleData = restTemplate.getForObject("http://localhost:8081/getData", SampleData.class);

        //When using Eureka server
        SampleData sampleData = restTemplate.getForObject("http://demo-application/getData", SampleData.class);
        return sampleData;
    }
}
