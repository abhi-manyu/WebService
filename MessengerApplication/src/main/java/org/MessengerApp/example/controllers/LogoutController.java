package org.MessengerApp.example.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController
{
    @GetMapping(value="/logout")
    public ModelAndView logout(HttpServletRequest request,
    		   HttpServletResponse response, Model mod)
    {
    	System.out.println("Logged out successfully, redirecting to log in page");
    	//return new ModelAndView("redirect:/logform");
    	return new ModelAndView("redirect:/logform");
    }
}
