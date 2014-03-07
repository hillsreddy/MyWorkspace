/**
 * 
 */
package springmvc.annotations.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

/**
 * @author Home
 *
 */
@Controller  
public class HelloController {  
      
    @RequestMapping("/hello")  
    public ModelAndView helloWorld(HttpServletRequest request,HttpServletResponse res) {  
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
          
        if(name.equals("admin") && password.equals("admin")){  
        String message = "HELLO "+name;  
        return new ModelAndView("hello", "message", message);  
        }  
        else{  
            return new ModelAndView("error", "message","Sorry, username or password error");  
        }  
    }  
      
}  
/*@Controller
@RequestMapping("/hello")
public class HelloController{
 
   @RequestMapping(method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "hello";
   }

}
@Controller
public class HelloController{
 
   @RequestMapping(value = "/hello", method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "hello";
   }

}*/
