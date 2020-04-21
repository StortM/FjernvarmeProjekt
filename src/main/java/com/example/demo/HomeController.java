package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/fjernvarme")
    public String TAO() {
        return "TAO";
    }

    @GetMapping("/energibesparelser")
    public String energibesparelser() {
        return "energibesparelser";
    }

}
