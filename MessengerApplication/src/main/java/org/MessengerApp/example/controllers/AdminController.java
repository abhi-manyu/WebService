package org.MessengerApp.example.controllers;

import javax.validation.Valid;

import org.MessengerApp.example.beans.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class AdminController
{
	private int counter=3;
	
  // @GetMapping(value="/logform")
   @RequestMapping(value="/logform")
   public String displayForm(Model mod)
   {
	   System.out.println("METHOD NAME DISPLAY FORM::");
	   mod.addAttribute("sign",new Admin());
	   System.out.println("Model"+ mod);
	   return "signin";
   }
   
   @PostMapping(value="/login")
   public String login(@Valid @ModelAttribute("sign")Admin sign,BindingResult res,Model mod)
   {
	   if(res.hasErrors())
	   {
		   return "signin";
	   }
	   else if(counter<=0)
	   {
		   String msg="<font style='font-family: cursive; color: red;font-size: 20px;'>"
		   		+ "get lost stupid fellow, u can not be the admin</font>";
		   mod.addAttribute("warning",msg);
		   return "signin";
	   }
	   else
	   {
		   if(sign.getUsername().equals("abhi") && sign.getPassword().equals("manyu"))
			   return "home";
		   else
		   {
			   counter--;
			   String msg="<mark> Note : </mark><span style='color: red;'>"
			   		                + "u have "+counter+" more chance ( credentials not matching )"
			   		                		+ "</span> ";
			   mod.addAttribute("warning",msg);
			   return "signin";
		   }
	   }
   }
}
