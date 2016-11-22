package cs544.carrental.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs544.carrental.domain.Admin;
import cs544.carrental.domain.Customer;

@Controller
public class LoginController {
	
	@RequestMapping(value={"/login"}, method=RequestMethod.GET)
	public String start(){
		System.out.println("In login controller");
		return "userlogin";
	}

}
