package registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import registration.dao.logindao;
import registration.model.Login;

/**
 * Servlet implementation class employeeloginservlet
 */
@WebServlet("/employeeloginservlet")
public class employeeloginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public employeeloginservlet() {
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
		String uname = request.getParameter("uname");
		String pass= request.getParameter("password");
		Login lg= new Login();
		lg.setUname(uname);
		lg.setPassword(pass);
	    logindao lgd =new logindao();
	    try {
	    	if (lgd.validate1(uname,pass))
	    	{
	    		HttpSession session=request.getSession();
	    		session.setAttribute("employeename", uname);
	    		response.sendRedirect("index.jsp");
	    		
	    	}
	    	else
	    	{
	    		request.setAttribute("error"," Wrong User Name or Password !!!" );
	    		RequestDispatcher rdi= request.getRequestDispatcher("employerlogin.jsp");
	    		rdi.forward(request, response);
	    	}
			} 
	    catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
