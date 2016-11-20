package cs544.carrental.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cs544.carrental.domain.Car;


@Controller
public class CarController {

	@RequestMapping(value = { "/" })
	public String home() {
		return "index";
	}
	
	 @RequestMapping(value = "/car", method = RequestMethod.GET)
	   public ModelAndView car() {
	      return new ModelAndView("car", "command", new Car());
	   }
	   
	   @RequestMapping(value = "/addcar", method = RequestMethod.POST)
	   public String addCar(@ModelAttribute("SpringWeb")Car car, 
	   ModelMap model) {
	      model.addAttribute("model", car.getModel());
	      model.addAttribute("number", car.getNumber());
	      model.addAttribute("type", car.getType());
	      model.addAttribute("seat", car.getSeat());
	      model.addAttribute("status", car.getStatus());
	      
	      return "result";
	   }

	/*@RequestMapping(value = { "/addvehicle" }, method = RequestMethod.POST)
	public String saveVehicle(@ModelAttribute("newVehicle") Vehicle newVehicle) {
		vehicleservice.addVehicle(newVehicle);
		return "vehicleList";
	}

	@RequestMapping(value = { "/vehicleList" }, method = RequestMethod.GET)
	public String displayVehicle(Model model) {
		model.addAttribute("vehicles", vehicleservice.findAvialableVehicle());
		return "vehicleList";
	}*/
}
