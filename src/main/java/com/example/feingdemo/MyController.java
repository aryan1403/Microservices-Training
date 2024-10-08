package com.example.feingdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feingdemo.Model.facts;
import com.example.feingdemo.repositories.factsClient;

@RestController
public class MyController {
    @Autowired
    factsClient client;

    @GetMapping("/getfacts") 
    public facts getFacts() {
        facts f1 = client.getDogFacts();
        List<String> f = f1.getFacts();
        f.add("This is customized fact by spring xD");
        f1.setFacts(f);
        return f1;
    }

}
