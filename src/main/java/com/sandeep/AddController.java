package com.sandeep;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
@RequestMapping("/add")
public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
	
	int A = Integer.parseInt(request.getParameter("I1"));
	int B = Integer.parseInt(request.getParameter("I2"));
	int C = A+B;
	
	ModelAndView MV = new ModelAndView();
	MV.setViewName("Display.jsp");
	MV.addObject("Result", C);

	return MV;
}

}
