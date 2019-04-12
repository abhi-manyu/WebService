package org.MVC_REST.example.controller;

import javax.validation.Valid;

import org.MVC_REST.example.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController
{
   @GetMapping(value="/registerform")
   public String displayform(Model mod)
   {
	   mod.addAttribute("reg",new Student());
	   return "regform";
   }
   
   @PostMapping(value="/register")
   public String register(@Valid @ModelAttribute("reg")Student st,BindingResult res)
   {
	   if(res.hasErrors())
		   return "regform";
	   else
		   return "success";
   }
}
