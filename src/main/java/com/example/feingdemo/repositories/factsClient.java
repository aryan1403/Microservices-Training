package com.example.feingdemo.repositories;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.feingdemo.Model.facts;

@FeignClient(value = "Dog-Facts", url = "https://dog-api.kinduff.com/api")
public interface factsClient {
    @GetMapping("/facts")
    public facts getDogFacts();
}
