package in.spring.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.spring.binding.Student;
import in.spring.entity.StudentEntity;
import in.spring.repo.StudentRepository;

@Controller
public class StudentController 
{   @Autowired
	private StudentRepository repo;
	@GetMapping("/")
  public String loadForm(Model model)
  {
		loadFormData(model);
	  return "index";
  }
	private void loadFormData(Model model) {
		List<String>courseList=new ArrayList();
		courseList.add("java");
		courseList.add("Python");
		courseList.add("DevOps");
		
		List<String>timingList=new ArrayList();
		timingList.add("Morining");
		timingList.add("Afternoon");
		timingList.add("Evening");
		model.addAttribute("courses",courseList);
		model.addAttribute("timings",timingList);
		
		Student student=new Student();
		model.addAttribute("student",student);
	}
	@PostMapping("/save")
	public String handleSubmit(Student s, Model model)
	{
		System.out.println(s);
		StudentEntity entity= new StudentEntity();
		BeanUtils.copyProperties(s, entity);
		entity.setTimings(Arrays.toString(s.getTimings()));
		repo.save(entity);
		loadFormData(model);
		model.addAttribute("msg","Student Data Succesfully Saved");
		return "index";
	}
}
