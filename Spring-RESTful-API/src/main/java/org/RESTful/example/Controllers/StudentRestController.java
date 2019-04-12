package org.RESTful.example.Controllers;

import org.RESTful.example.domain.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController
{
   @RequestMapping("/")
   public String nonRestWelcome()
   {
	   return "welcome to xxxxxx company-employee portal";
   }
   
   @RequestMapping("/hello/{name}/{mail}")
   public Employee emp(@PathVariable String name,@PathVariable String mail)
   {
	   Employee emp=new Employee(name, mail);
	   return emp;
   }
}
