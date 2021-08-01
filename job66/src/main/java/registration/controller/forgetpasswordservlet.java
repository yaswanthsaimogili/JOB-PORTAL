package registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import registration.dao.forgetpassworddao;
import registration.model.forgetpassword;

/**
 * Servlet implementation class forgetpasswordservlet
 */
@WebServlet("/forgetpasswordservlet")
public class forgetpasswordservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public forgetpasswordservlet() {
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
		String uname = request.getParameter("uname");
		String pass= request.getParameter("password");
		forgetpassword lg= new forgetpassword();
		lg.setEmail(uname);
		lg.setPassword(pass);
	   forgetpassworddao lgd= new forgetpassworddao();
	    try {
	    	if (lgd.validate(uname,pass))
	    	{
	    		
	    		response.sendRedirect("login.jsp");
	    		
	    	}
	    	else
	    	{
	    		request.setAttribute("error","Wrong EmailId !!!" );
	    		RequestDispatcher rdi= request.getRequestDispatcher("forgetpassword.jsp");
	    		rdi.forward(request, response);
	    	}
			} 
	    catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	    
	}
}
