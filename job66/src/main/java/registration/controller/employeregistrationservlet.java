package registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import registration.dao.employerregistrationdao;

import registration.model.employerregistration;


/**
 * Servlet implementation class employeregistrationservlet
 */
@WebServlet("/employeregistrationservlet")
public class employeregistrationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public employeregistrationservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   String companyname =request.getParameter("companyname");
		   String country=request.getParameter("country");
		   String state=request.getParameter("state");
		   String city =request.getParameter("city");
		   String area=request.getParameter("area");
		   String domain=request.getParameter("domain");
		   String email=request.getParameter("email");
		   String website=request.getParameter("website");
		   String representativename=request.getParameter("representativename");
		   String representativeemail=request.getParameter("representativeemail");
		   String representativeposition=request.getParameter("representativeposition");
		   String phoneno=request.getParameter("phoneno");
		   String description=request.getParameter("description");
		   String password=request.getParameter("password");
		
		  // System.out.println(companyname+representativename+representativeemail+representativeposition+phoneno+description+password);
		
		employerregistration rb= new employerregistration();
		rb.setCompanyname(companyname);
		rb.setCountry(country);
		rb.setState(state);
		rb.setCity(city);
		rb.setArea(area);
		rb.setDomain(domain);
		rb.setEmail(email);
		rb.setWebsite(website);
		rb.setRepresentativename(representativename);
		rb.setRepresentativeemail(representativeemail);
		rb.setRepresentativeposition(representativeposition);
		rb.setPhoneno(phoneno);
		rb.setDescription(description);
		rb.setPassword(password);
		
		employerregistrationdao rd =new employerregistrationdao();
	    try {
	    	if (rd.validate(companyname))
	    	{
	    		request.setAttribute("error","User Name Already Exist Try New !!!" );
	    		RequestDispatcher rdi= request.getRequestDispatcher("employeeregister.jsp");
	    		rdi.include(request, response);
	    	}
	    	else
	    	{
	    		rd.registerEmployee(rb);
	    		System.out.print("Registartion Successful");
	    		response.sendRedirect("login.jsp");
	    	}
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}

