package org.messenger.example.controllers;

import javax.validation.Valid;

import org.messenger.example.beans.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController
{
      @GetMapping(value="/display")
      public String displayForm(Model mod)
      {
    	  System.out.println("method hit");
    	    mod.addAttribute("login",new Admin());
    	    return "login";
      }
      
      @PostMapping(value="/login")
      public String doLogin(@Valid @ModelAttribute("login")Admin login,BindingResult result)
      {
    	  if(result.hasErrors())
    		  return "login";
    	  return "home";
      }
}
