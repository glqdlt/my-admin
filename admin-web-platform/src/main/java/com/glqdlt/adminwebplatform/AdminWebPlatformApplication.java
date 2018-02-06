package com.glqdlt.adminwebplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class AdminWebPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminWebPlatformApplication.class, args);
    }

    @RequestMapping("/")
    String root() {
        return "index";
    }
}
