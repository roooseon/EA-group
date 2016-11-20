package cs544.carrental.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs544.carrental.domain.Car;


@Controller
public class CarController {

	@RequestMapping(value = { "/" })
	public String home() {
		return "index";
	}

	@RequestMapping(value = { "/addcar" })
	public String addCar() {
		return "addCar";
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
