package codestates.gitflowpractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {

    @GetMapping
    public String sample() {
        return "To-do Application !";
    }
}
