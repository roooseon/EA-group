package cs544.carrental.car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		
		model.addAttribute("model", car.getModel());
		model.addAttribute("company", car.getCompany());
		model.addAttribute("number", car.getNumber());
		model.addAttribute("type", car.getType());
		model.addAttribute("seat", car.getSeat());
		model.addAttribute("builtYear", car.getBuiltYear());

		
		//model.addAttribute("status", car.getStatus());
		
		carService.addCar(car);
		
		return "redirect:"+ "/carlist";
	}
	
	@RequestMapping(value = "/carlist", method = RequestMethod.GET)
	public String taskList(Map<String, Object> model) {
		model.put("car", carService.getAllCar());
		return "carList";
	}
	
	
	
}
