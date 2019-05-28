package com.rdc.oauth2demo.SpringOauth2Wrapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class WelcomeController {

   @GetMapping
   public String welcomePage(){
        return "Hello Rashmit";
   }
}
