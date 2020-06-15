package com.website.Controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.website.Model.CustomerOrder;
import com.website.Service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService service;
	@Autowired
	private CustomerController custom;
	
	
	@RequestMapping("/placeorder")
	public String placeorder(@ModelAttribute("orderCloth") CustomerOrder order)
	{
		System.out.println("The name of the Customer is"+custom.Customername);
		System.out.println("The value of Checkbox is"+order.getOrderDetails());		
		String details=order.getOrderDetails();
		try {
		CustomerOrder custorder=new CustomerOrder(custom.Customername,details);
		service.saveorders(custorder);
		System.out.println("Order Saved!!");
		return "placeorder";
		}
		catch (Exception e) {
			System.out.println(e);
			return null;
		}
}
	
	@RequestMapping("/cart")
	public String cartpage(Model m)
	{
	    List<CustomerOrder> customerdetails=service.getOrdersByName(custom.Customername);
		for (Iterator iterator = customerdetails.iterator(); iterator.hasNext();) {
			CustomerOrder customerOrder = (CustomerOrder) iterator.next();
			System.out.println(customerOrder.getUserName()+" "+customerOrder.getOrderDetails());
		}
		m.addAttribute("list",customerdetails);
		return "cart";
	}
	
	@RequestMapping("/Mainpage")
	public String mainpage(Model model)
	{
		model.addAttribute("orderCloth",new CustomerOrder() );
		return "main";
	}
	
}

