package cs544.carrental.customer;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs544.carrental.domain.Customer;
@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerServiceImpl customerservice;
	
	@RequestMapping(value={"/signup"}, method=RequestMethod.GET)
	public String signUp(@ModelAttribute("customer")Customer customer){
		System.out.println("In signup get customer");
		return "signup";
	}
	@RequestMapping(value={"/signup"}, method=RequestMethod.POST)
	public String addCustomer(@Valid @ModelAttribute("customer")Customer customer,BindingResult result,Model model){
		if(result.hasErrors()){
			return "signup";
		}
		if(!(customer.getPassword().equals(customer.getConfirmPassword()))){
			model.addAttribute("message",new String("Password doesn't match"));
			return "signup";
		}
		customerservice.addCustomer(customer);
		return "success";
	}
	
	/*@RequestMapping(value={"/check"}, method=RequestMethod.POST)
	public String checkCustomer(@ModelAttribute("customer")Customer customer){
		System.out.println("Customer username@@@@@@@@@@@@@ "+customer.getUsername());
		System.out.println("Customer password@@@@@@@@@@@ "+customer.getPassword());
		return "success";
	}*/
	
	@RequestMapping(value={"/customers"}, method=RequestMethod.GET)
	public String seeAllCustomers(Model model){
		System.out.println("In customers");
		List<Customer> customers=customerservice.getAllCustomer();
		model.addAttribute("customers",customers);
		/*System.out.println(customers.get(3).getEmail());*/
		return "customerlist";
	}

	@RequestMapping("/customerdelete/{id}")
	public String seeCustomerDetails(@PathVariable("id")int id,Model model){
		System.out.println("@@@@@@@+"+id);
		customerservice.deleteCustomer(id);
		List<Customer> customers=customerservice.getAllCustomer();
		model.addAttribute("customers",customers);
		return "customerlist";
		
	}
	
}
