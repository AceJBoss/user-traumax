package com.savvybytes.usertraumax.controllers;

import com.savvybytes.usertraumax.models.DynamicResponse;
import com.savvybytes.usertraumax.models.Programme;
import com.savvybytes.usertraumax.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.ws.rs.GET;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("programmes")
    public Programme getProgramme(){
        Programme programme = restTemplate.getForObject("http://traumax-programme-service/api/v1/fetch-all-programmes", Programme.class);
        return programme;
//        DynamicResponse dynamicResponses = restTemplate.getForObject("http://traumax-programme-service/api/v1/fetch-all-programmes", DynamicResponse.class);
//        return dynamicResponses.getProgrammeList();
    }

}
