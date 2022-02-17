package santiago.oliveira;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
//	Generamos un formulario para crear informacion
	@RequestMapping(value="/formulario")
	public String formulaario() {
		return "formulario";
	}
	
//	Generamos metodo que procese esa informacion
	@RequestMapping(value="/procesarInformacion")
	public String procesarInformacion() {
		return "informacionProcesada";
	}
	
	@RequestMapping(value="/infoModel")
	public String infoModel(HttpServletRequest request, Model model) {
		
		String nombre = request.getParameter("nombre");
		
		nombre = nombre.toLowerCase();
		
		model.addAttribute(nombre);
		
		return "informacionProcesada";
	}

}
