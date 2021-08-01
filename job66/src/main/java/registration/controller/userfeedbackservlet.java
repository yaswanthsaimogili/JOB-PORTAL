package registration.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import registration.dao.userfeedbackdao;
import registration.model.userfeedback;

/**
 * Servlet implementation class userfeedbackservlet
 */
@WebServlet("/userfeedbackservlet")
public class userfeedbackservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userfeedbackservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
		String fname= request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String cname = request.getParameter("Cname");
		String subject = request.getParameter("subject");
		HttpSession session1 = request.getSession();
		String userId =(String) session1.getAttribute("username");
		
		
		userfeedback rb= new userfeedback();
		rb.setFname(fname);
		rb.setLname(lname);
		rb.setEmail(email);
		rb.setCname(cname);
		rb.setSubject(subject);
		
		
		
		
		
		
		userfeedbackdao rd =new userfeedbackdao();
	    try {
	    		rd.userfeedbackdata(rb,userId);
	    		System.out.print("feedback Successful");
	    		response.sendRedirect("userfeedback.jsp");
	    		
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
