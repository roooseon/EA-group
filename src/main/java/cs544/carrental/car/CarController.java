package cs544.carrental.car;

import java.io.File;
import java.io.IOException;
import java.security.Principal;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cs544.carrental.customer.CustomerServiceImpl;
import cs544.carrental.domain.Car;
import cs544.carrental.domain.CarType;
import cs544.carrental.domain.Customer;

@Controller
public class CarController {

	@Autowired
	CarService carService;
	
	@Autowired
	CustomerServiceImpl customerService;

	@Autowired
	ServletContext servletContext;
	
	@RequestMapping(value ="/addcar", method = RequestMethod.GET)
	public String addCar(@ModelAttribute("car") Car car){
	return "addCar";
	}
	
	@RequestMapping(value = "/addcar", method = RequestMethod.POST)
	public String add(@Valid Car car, BindingResult result, Model model){		
		String view = "redirect:/carlist";
		
		MultipartFile carImage = car.getTempImg();
		String rootDirectory = servletContext.getRealPath("/"); 
		
		
			if(!result.hasErrors()) {
				
				Car savedCar = carService.addCar(car);
				model.addAttribute("message",new String("Car added successfully"));	
				System.out.println(savedCar.getId());
				System.out.println("-------------------------");
				System.out.println("-------------------------");
				
				try {
					carImage.transferTo(new File(rootDirectory+"\\images\\" + savedCar.getId() + ".jpg"));
				} catch (IllegalStateException e1) {
					
					e1.printStackTrace();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				try {
					car.setImage(car.getTempImg().getBytes());
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		else{
			view = "addCar";
		}

		return view;
	}
	
	@RequestMapping(value = "/updatecar/{id}", method = RequestMethod.GET)
	public String update(@PathVariable("id") int id, Model model){
		model.addAttribute("car", carService.getCarById(id));
		return "updateCar";
	}
	
	@RequestMapping(value = "/updatecar/{id}", method = RequestMethod.POST)
	public String updateCar(@Valid Car car, BindingResult result, @PathVariable("id") int id) {
		car.setId(id);		
		String view = "redirect:/cardetails/" + id;
		
		MultipartFile carImage = car.getTempImg();
		String rootDirectory = servletContext.getRealPath("/"); 
			
		//carService.addCar(car);
		
		try {
			carImage.transferTo(new File(rootDirectory+"\\images\\" + car.getId() + ".jpg"));
		} catch (IllegalStateException e1) {
			
			e1.printStackTrace();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		try {
			car.setImage(car.getTempImg().getBytes());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		if(!result.hasErrors()) {
			carService.addCar(car);
		}
		else{
			view = "updateCar";
		}
		
		return view;
	}
	

	@RequestMapping(value = "/carlist", method = {RequestMethod.GET, RequestMethod.POST})
	public String carList(Map<String, Object> model) {
		model.put("car", carService.getAllCar());
		return "carList";
	}	
	
	@RequestMapping(value = "/carlistuser", method = {RequestMethod.GET, RequestMethod.POST})
	public String carListUser(Map<String, Object> model,Principal p,Model m) {
		System.out.println("@@@@@@@@@"+p.getName()+"@@@@@@@@");
		Customer c=customerService.getCustomerByUserName(p.getName());
		m.addAttribute("user",c.getName());
		model.put("car", carService.getAvailableCars());
		return "carListUser";
	}	
	
	@RequestMapping("/mycars")
	public String showMyCars(Model model,Principal p){
		Customer c=customerService.getCustomerByUserName(p.getName());
		Car cr=c.getCar();
		//System.out.println("#############"+cr);
		System.out.println(cr.toString());
		model.addAttribute("cr",cr);
		model.addAttribute("car",carService.getAvailableCars());
		model.addAttribute("user",c.getName());
		return "carListUser";
	}
	
/*	@RequestMapping(value = "/carlist", method = RequestMethod.POST)
	public String carListPOST(Map<String, Object> model) {
		model.put("car", carService.getAllCar());
		return "carList";
	}*/
	
	@RequestMapping("/cardetails/{id}")
	public String detailCar(Model model, @PathVariable("id") int id, Car car) {
		Car findOne = carService.getCarById(id);
		model.addAttribute("car", findOne);
		System.out.println(id);
		return "carDetails";
	}
	
	@RequestMapping("/cardetailsuser/{id}")
	public String detailCarUser(Model model, @PathVariable("id") int id, Car car) {
		Car findOne = carService.getCarById(id);
		model.addAttribute("car", findOne);
		System.out.println(id);
		return "carDetailsUser";
	}
	
	@RequestMapping("/deletecar/{id}")
	public String removePerson(@PathVariable("id") int id) {
		carService.deleteCar(id);
		System.out.println("Delete function");
		return "redirect:/carlistuser";
	}
	
	
	
	/*@RequestMapping(value ="/signupcar", method = RequestMethod.GET)
	public String signUp(){
		return "signup";
	}*/
	
	
	
	
	
}
