package cs544.carrental.car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cs544.carrental.domain.Car;
import cs544.carrental.domain.CarType;

@Controller
public class CarController {

	@Autowired
	CarService carService;

	@RequestMapping(value = "/car", method = RequestMethod.GET)
	public ModelAndView car() {
		return new ModelAndView("car", "command", new Car());
	}	

	
	@RequestMapping(value = "/addcar", method = RequestMethod.POST)
	public String addCar(@ModelAttribute("SpringWeb") Car car, ModelMap model) {
		
		//model.addAttribute("model", car.getModel());
		carService.addCar(car);
		
		return "redirect:/carlist";
	}
	
	@RequestMapping(value = "/carlist", method = RequestMethod.GET)
	public String carList(Map<String, Object> model) {
		model.put("car", carService.getAllCar());
		return "carList";
	}	
	
	@RequestMapping("/cardetails/{id}")
	public String detailVehicle(Model model, @PathVariable("id") int id, Car car) {
		Car findOne = carService.getCarById(id);
		model.addAttribute("car", findOne);
		System.out.println(id);
		return "carDetails";
	}
	
	/*@RequestMapping(value = "/cardetails/{id}", method = RequestMethod.POST)
	public String car(@PathVariable int id, Model model) {
		carService.getCarById(id);
		return "carDetails";
	}*/
	
	/*@RequestMapping(value = "/car/{id}", method = RequestMethod.POST)
	public String car(@PathVariable int id, Model model) {
		carService.deleteCar(id);	
		String[] val = id.split(".");
		System.out.println(val[0] +"-" + val[1]);
		return "redirect:/carlist";
	}*/
	
	
	
	@RequestMapping(value ="/signup", method = RequestMethod.GET)
	public String signUp(){
		return "signup";
	}
	
	
	
	
}
