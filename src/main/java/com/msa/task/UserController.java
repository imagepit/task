package com.msa.task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
  @GetMapping("/user")
  public String hello() {
    return "ユーザ機能!";
  }
}