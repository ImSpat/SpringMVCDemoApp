package pl.ImSpat.springMVC.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// controller method to show HTML form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// controller method to process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// new controller method to read data and add data to model
	@RequestMapping("/processFormVersionTwo")
	public String ShoutYo(HttpServletRequest request, Model model) {
		
		// read the request param from HTTP form
		String theName = request.getParameter("studentName");
		
		// convert the data to shout
		theName = theName.toUpperCase();
		
		// create message
		String result = "Hey! " + theName;
		
		//add message to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName")String theName,
			Model model) {
		
		// convert the data to shout
		theName = theName.toUpperCase();
		
		// create message
		String result = "Yo its version 3! " + theName;
		
		//add message to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
