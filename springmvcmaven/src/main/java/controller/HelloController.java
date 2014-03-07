/**
 * 
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author Home
 *
 */
public class HelloController implements Controller {

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.Controller#handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String message = "Hello every1";
		ModelAndView modelAndView = new ModelAndView("hello");
		System.out.println("controller....dfgdfg.........");
//		modelAndView.setViewName("hello");
		modelAndView.addObject("message", message);
		return modelAndView;
	}

}
