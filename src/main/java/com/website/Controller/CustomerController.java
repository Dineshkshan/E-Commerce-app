package com.website.Controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.website.Model.Customer;
import com.website.Model.CustomerOrder;
import com.website.Service.ServiceClass;

@Controller
public class CustomerController {
	
	@Autowired
	private ServiceClass service;
	String Customername;
	@RequestMapping("/")
	public String indexpage()
	{
		return "Login";
	}
	@RequestMapping("/Login")
	public String Registerpage(HttpServletRequest request)
	{
		String uname=request.getParameter("uname");
		String phone=request.getParameter("pnumber");
		String password=request.getParameter("password");
		String Cpassword=request.getParameter("cpassword");
		Customer cust=new Customer(uname,phone,password,Cpassword);
		System.out.println(cust.getCustomerName());
        service.saveCustomers(cust);
        System.out.println("Done");
        return "Login";
	}
	
	@RequestMapping("/Register")
	public String Registeration(HttpServletRequest request)
	{
		return "Register";
	}
	
	@RequestMapping("/main")
	public String Mainpage(HttpServletRequest request,HttpServletResponse response,Model model) throws Exception
	{
		//String value="Super Hero";
		PrintWriter out = response.getWriter();
		String CustomerName=request.getParameter("textbox1");
		System.out.println(CustomerName);
		Customername=CustomerName;
		String Password=request.getParameter("textbox2");
		System.out.println(Password);
		Customer cus=service.getCustomerByID(CustomerName);
		System.out.println("The value of entered Customers are"+cus.getCustomerName() +" "+cus.getPassword());
		String name=cus.getCustomerName();
		String pass=cus.getPassword();
		if(CustomerName.equals(name) && Password.equals(pass))
		{
			System.out.println("------------------>"+name);
			model.addAttribute("orderCloth",new CustomerOrder() );
			return "main";
		}
 	   out.println("<script type=\"text/javascript\">");
 	   out.println("alert('User or password incorrect');");
 	   out.println("location='/';");
 	   out.println("</script>");
       return null;
	}    
}
