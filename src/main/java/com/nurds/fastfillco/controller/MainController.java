package com.nurds.fastfillco.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @RequestMapping("/")
  @ResponseBody
  public String index() {
    return "<html><body><img src=\"/image/1.png\" alt=\"First Image\" ></br><img src=\"/image/2.png\" alt=\"Second Image\" ></body></html>";
  }
  
  @RequestMapping("/ola/tokens")
  @ResponseBody
  public void indexTest() {
    System.out.println("Inside /ola/tokens"); 
  }

}
