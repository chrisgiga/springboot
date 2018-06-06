package java.com.tw4gamers.newwebapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {
    // list all account

    // list all female account
    // this is new comment
    @GetMapping("/")
    public Map<String, String> index() {
        HashMap<String, String> map = new HashMap<>();
        map.put("data", "hello world!");
        return map;
    }
}
