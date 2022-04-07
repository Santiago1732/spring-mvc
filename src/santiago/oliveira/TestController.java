package santiago.oliveira;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("alo")
public class TestController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		
		return "hello-world-form";
		
	}

}
