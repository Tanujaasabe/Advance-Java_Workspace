package com.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.entity.Employe;
import com.mvc.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private final EmployeeService S;
	
	public EmployeeController(EmployeeService S)
	{
		super();
		this.S=S;
	}

	
	@GetMapping("/home")
	public String home()
	{
		return"homepage";
	}
	
  @PostMapping("/login")
  public String login(@RequestParam String name,@RequestParam String password,Model m)
  {
	  System.out.println("Employee name"+name);
	  System.out.println("Employee password"+password);
	  m.addAttribute("key"+name.toUpperCase());
	  return"addEmp";
  }
  
  
  @PostMapping("/addEmp")
  public String ADDEmp(@ModelAttribute Employe emp) {

      System.out.println("Employee before DB = " + emp);

      S.ADDEmp(emp);

      return "redirect:/showEmp"; 
  }
  
  
 
  
  @GetMapping("/showEmp")
  public String showall(Model m) {

      List<Employe> emp = S.showall();

      System.out.println(emp);  

      m.addAttribute("employees", emp);

      return "showEmp";
  }
  
  @GetMapping("/edit/{id}")
  public String editPage(@PathVariable int id, Model model) {

      Employe emp = S.getById(id);   
      model.addAttribute("emp", emp);

      return "edit";
  }

  
  
  @PostMapping("/update/{id}")
  public String update(@PathVariable int id,
                       @ModelAttribute Employe emp) {
      S.editdata(id, emp);
      return "redirect:/showEmp";
  }
  
  @GetMapping("/delete/{id}")
  public String delete(@PathVariable int id) {

      S.deleteById(id);

      return "redirect:/showEmp";
  }
  
}

