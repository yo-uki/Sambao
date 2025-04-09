package pl.youki.Sambao.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "sambao")
public class SambaoResource {


    @GetMapping(path = "/hello")
    public String hello(){
        return "Hejka!";
    }
}
