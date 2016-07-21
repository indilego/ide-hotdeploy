package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
    	String a="Hola ";
    	int z=0;
    	//String salida=llamada("ok");
    	String salida="1";
    	String b="Adios 1111";
        return salida+z+a+b+"Cambiado 2";
    }

	/*private String llamada(String string) {
		// TODO Auto-generated method stub
		return"ko";
	}*/

}
