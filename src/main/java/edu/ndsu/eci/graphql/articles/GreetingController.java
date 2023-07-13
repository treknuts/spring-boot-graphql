package edu.ndsu.eci.graphql.articles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingController {

    @GetMapping
    public String defaultGreet() {
        return "Hello, {unknown user}";
    }

    @GetMapping("/{username}")
    public String greetUser(@PathVariable String username) {
        return "Hello, " + username + "!";
    }

}
