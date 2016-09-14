package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
    	String a="Hola 9";
    	int z=2;
    	String salida="";
    	
    	String b="Adios ";
    	
    	//salida=f();
        return salida+z+a+b+"Cambiado 50";
    	
    }

/*    private String f() {
		// TODO Auto-generated method stub
		return "fffffffffffff";
	}*/

}


