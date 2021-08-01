package registration.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import registration.dao.emplyerfeedbackdao;

import registration.model.employerfeedback;


/**
 * Servlet implementation class employerfeedbackservlet
 */
@WebServlet("/employerfeedbackservlet")
public class employerfeedbackservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public employerfeedbackservlet() {
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

		String email = request.getParameter("email");
		String cname = request.getParameter("Cname");
		String subject = request.getParameter("subject");
		
		HttpSession session1 = request.getSession();
		String userId =(String) session1.getAttribute("employeename");
		employerfeedback rb= new employerfeedback();

		rb.setEmail(email);
		rb.setCname(cname);
		rb.setSubject(subject);
		
		
		
		
		
		
		emplyerfeedbackdao rd =new emplyerfeedbackdao();
	    try {
	    		rd.employerfeedbackdata(rb,userId);
	    		System.out.print("feedback Successful");
	    		response.sendRedirect("employerfeedback.jsp");
	    		
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
	}
}
