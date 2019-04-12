package org.MVC_REST.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController
{
   @GetMapping(value="/showlogin")
   public String displayForm()
   {
	   return "signinform";
   }
   
   @PostMapping(value="/login")
   public String signin(HttpServletRequest request)
   {
	   String name=request.getParameter("unm");
	   String password=request.getParameter("pas");
	   if(name!=null && name.equals("abhi") && password!=null && password.equals("manyu"))
	   {
		   return "logged";
	   }
	   else {
		return "failed";
	}
   }
}
