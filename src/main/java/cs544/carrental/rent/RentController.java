package cs544.carrental.rent;



//import java.util.Date;

//import java.time.LocalDate;

import java.lang.Object;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import cs544.carrental.car.CarService;
import cs544.carrental.domain.Car;
//import cs544.carrental.domain.Payment;
import cs544.carrental.domain.Rent;




@Controller
public class RentController {
	
	
	@Autowired
	CarService carService;
	
	@Autowired
	IRentService rentService;
	
	@RequestMapping(value = "/rentID/{id}", method = RequestMethod.GET  )
	public String orderDetail(@PathVariable int id, ModelMap model , HttpSession session){
		
		//Rent rent = new Rent();
		
		Car car = carService.getCarById(id);
		
	//	rent.setCar(car);
		
		session.setAttribute("car", car);
		
	//	model.addAttribute("car", car);
		
		//model.addAttribute("rent", rent);
	
		return  "rentCar";
	}
	
	@RequestMapping(value = "/pay", method = RequestMethod.POST)
	public String  addRent(@ModelAttribute Rent rent , Car car, Model model ,HttpSession session){
	
		//System.out.println(rent.getRentPerDay());
		
		Car car1 = (Car)session.getAttribute("car");
		
		System.out.println("from session" + car1.getModel());
		
		rent.setCar(car1);
		System.out.println("from session rent " + rent.getCar().getModel());
		
		
		model.addAttribute("rent", rent);

		rentService.saveRent(rent);

	
		session.setAttribute("rent", rent);
		
		/*model.addAttribute("allRent", rentService.getAllRent());
		List<Car> allCars = carService.getAllCar();
		model.addAttribute("allCars", allCars );*/
	
		return "Payment";
		
		/*		System.out.println(rent.getRentedDate());
		System.out.println(rent.getReturnedDate());		
		System.out.println(rent.getRentPerDay());*/
		//model.addAttribute("car", carService.getCarById(id));
	//	Rent rent1 = new Rent(50 ,"2015/10/10" , "2015/11/11");
		
	}
	
	
	
}
