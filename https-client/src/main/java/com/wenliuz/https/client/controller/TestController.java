package com.wenliuz.https.client.controller;

import com.wenliuz.https.client.client.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestClient testClient;

    @RequestMapping("/")
    public String test() {
        String s = testClient.test();
        System.out.println(s);
        return "https-client!";
    }
}
