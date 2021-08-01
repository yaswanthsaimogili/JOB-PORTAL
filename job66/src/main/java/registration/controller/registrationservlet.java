package registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import registration.dao.registrationdao;
import registration.model.registration;

/**
     Servlet implementation class registrationservlet
 *
 */
@WebServlet("/registrationservlet")
public class registrationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registrationservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
		String fname= request.getParameter("fname");
		String password = request.getParameter("password");
		String lname = request.getParameter("lname");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String phoneno = request.getParameter("phoneno");
		String country = request.getParameter("country");
		String city = request.getParameter("city");
		String jobtitle = request.getParameter("jobtitle");
		String collegename = request.getParameter("collegename");
		String percentage = request.getParameter("percentage");
		String qualification = request.getParameter("qualification");
		String specilization = request.getParameter("specilization");
		String skills = request.getParameter("skills");
		String experience = request.getParameter("experience");
		String gender = request.getParameter("gender");
		
		
		registration rb= new registration();
		rb.setFname(fname);
		rb.setPassword(password);
		rb.setLname(lname);
		rb.setUsername(username);
		rb.setCity(city);
		rb.setEmail(email);
		rb.setPhoneno(phoneno);
		rb.setCountry(country);
		rb.setJobtitle(jobtitle);
		rb.setCollegename(collegename);
		rb.setPercentage(percentage);
		rb.setQualification(qualification);
		rb.setSpecilization(specilization);
		rb.setSkills(skills);
		rb.setExperience(experience);
		rb.setGender(gender);
		
		
		
		
		
		
		registrationdao rd =new registrationdao();
	    try {
	    	if (rd.validate(username))
	    	{
	    		request.setAttribute("error","User Name Already Exist Try New !!!" );
	    		RequestDispatcher rdi= request.getRequestDispatcher("registration.jsp");
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
