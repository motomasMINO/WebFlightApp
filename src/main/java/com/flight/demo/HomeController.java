package com.flight.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// ホームページを表示するコントローラークラス
@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index"; // index.htmlを表示
    }
}
