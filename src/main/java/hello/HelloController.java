package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
    	String a="Hola";
    	String b="adios";
        return a+b+"Cambiado 1";
    }
    
}
