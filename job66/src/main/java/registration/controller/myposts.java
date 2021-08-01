package registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import registration.dao.mypostsdao;


/**
 * Servlet implementation class myposts
 */
@WebServlet("/myposts")
public class myposts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myposts() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			mypostsdao mp = new mypostsdao();
			HttpSession session1 = request.getSession();
			String employeeId =(String) session1.getAttribute("employeename");
			String userId =(String) session1.getAttribute("username");
			System.out.print(userId);
			if (userId!=null)
			{
				request.setAttribute("searchresult",mp.myfeedbacks(userId));
				RequestDispatcher rd = request.getRequestDispatcher("Myposts.jsp");
				rd.forward(request, response);
				
			}
			else if (employeeId!=null)
			{
			request.setAttribute("searchresult",mp.myposts(employeeId));
			RequestDispatcher rd = request.getRequestDispatcher("Myposts.jsp");
			rd.forward(request, response);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
