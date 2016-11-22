package cs544.carrental.payment;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cs544.carrental.domain.Car;
import cs544.carrental.domain.Payment;
import cs544.carrental.domain.Rent;

@Controller
public class PaymentController {
	
	@Autowired
	private IPaymentService payService;
	
	
	/*@RequestMapping(value = "/payment")
	public String Validrent( @ModelAttribute("payment1") Payment payment  ) {
		
		
		return "Payment" ;
		
	}*/
	
	@RequestMapping(value = "/payment", method = RequestMethod.POST)
	public String rentDetail(@ModelAttribute Payment payment , Rent rent , Model model,HttpSession session){
		
		/*if(result.hasErrors()){
			
			return "Payment";	
		}*/
		
		
/*		System.out.println(payment.getRent());
		System.out.println(payment.getCreditCardNo());
		System.out.println(payment.getPayID());
		System.out.println(payment.getcVV());*/
		
	
	/*	
		System.out.println(payment.getRent().getRentedDate());
		System.out.println(payment.getRent().getReturnedDate());*/
		
		System.out.println(payment.getcVV());
		
		Rent rent1 = (Rent)session.getAttribute("rent");
		
		payment.setRent(rent1);
		
		System.out.println(payment.getRent().getRentedDate());
		
		
		model.addAttribute("payment", payment);

		payService.savePayment(payment);
		//	ModelAndView model1 = new ModelAndView("ThankYou");
		return  "ThankYou";

}
	
	@RequestMapping(value = "/home")
	public String rentDetail(Model model){
		
		return "carList";
	}
	
	
	
	
}
