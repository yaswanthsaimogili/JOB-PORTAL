package registration.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import registration.dao.postjobdao;
import registration.model.postjob;

/**
 * Servlet implementation class postjobservlet
 */
@WebServlet("/postjobservlet")
public class postjobservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public postjobservlet() {
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
		doGet(request, response);
		   String companyname =request.getParameter("cname");
		   String location=request.getParameter("location");
		   String role=request.getParameter("role");
		   String experience =request.getParameter("experience");
		   String salary=request.getParameter("salary");
		   String skills=request.getParameter("skills");
		   String shift=request.getParameter("shift");
		   String email=request.getParameter("email");
		   String details=request.getParameter("details");
		   String link =request.getParameter("link");
	
			HttpSession session1 = request.getSession();
			String userId =(String) session1.getAttribute("employeename");
		   
		postjob rb= new postjob();
		rb.setCname(companyname);
		rb.setLocation(location);
		rb.setRole(role);
		rb.setExperience(experience);
		rb.setSalary(salary);
		rb.setSkills(skills);
		rb.setShift(shift);
		rb.setEmail(email);
		rb.setDetails(details);
		rb.setLink(link);
			
		
		postjobdao rd =new postjobdao();
	    try {
	
	    		rd.postjob(rb,userId);
	    
	    		response.sendRedirect("postjobform.jsp");
	    	}
			 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}

