package santiago.oliveira;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
//necesito un controlador para mostrar un formulario de html.
	@RequestMapping("/showForm")
	public String showForm(){
		return "hello-world-form";
	}
	
	
//	necesito un metodo que procese el formulario html
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("studentName");
		
		theName = theName.toUpperCase();
		
		String result = "Mi nombre en mayuscula: "+ theName;
		
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}
	
	
	@RequestMapping("/procesarInfoVersionTres")
	public String processFormVersionTwo(
			@RequestParam("studentName") String theName, Model model) {
		
		theName = theName.toUpperCase();	
		String result = "Mi nombre en mayuscula: "+ theName;
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
}
