package kg.itacademy.homework59.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greeting")
public class HelloController {

    @GetMapping("/hello")
    public String hello ()
    {
        return "hello";
    }

    @PostMapping("/helloname")
    public String helloName ( @RequestBody String name )
    {
        return "hello" + name;

    }
}
