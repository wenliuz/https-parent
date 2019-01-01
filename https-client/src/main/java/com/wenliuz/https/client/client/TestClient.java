package com.wenliuz.https.client.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url = "http://127.0.0.1:8081",name = "https-server")
public interface TestClient {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    String test();

}
