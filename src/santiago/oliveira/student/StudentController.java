package santiago.oliveira.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("/studentForm")
	public String studentForm(Model model) {
		
		Student student = new Student();
		
		model.addAttribute("student", student);
	
	}
	
	@RequestMapping("/procesarInformacion")
	public String processFormVersionTwo(@ModelAttribute("student") Student student) {
		
			
		System.out.println(student.getNombre());

		return "studentData";
		
	}
	
}
