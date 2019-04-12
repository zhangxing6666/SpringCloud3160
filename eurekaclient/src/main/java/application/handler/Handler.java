package application.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Handler {
    @RequestMapping("/")
    public String index(){
        return "Hello World--SpringCloud";
    }
}
