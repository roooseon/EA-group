package cs544.carrental.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import cs544.carrental.domain.Admin;
import cs544.carrental.domain.Customer;

@Controller
public class AdminController {
	@Autowired
	AdminService adminService;
	
	@RequestMapping(value={"/"}, method=RequestMethod.GET)
	public String start(@ModelAttribute("customer")Customer customer){
		adminService.addAdmin(new Admin());
		return "signup";
	}
	

}
