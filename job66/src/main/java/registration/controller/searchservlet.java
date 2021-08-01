package registration.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import registration.dao.searchdao;


/**
 * Servlet implementation class searchservlet
 */
@WebServlet("/searchservlet")
public class searchservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int total;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());	
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String role= request.getParameter("role");
		String location = request.getParameter("location");
		String company =request.getParameter("company");

		
		
		searchdao rb = new searchdao();
		//System.out.print("total");
		//searchdao rb = new searchdao();
		
		
		
		
		try
		{
			if (!role.isEmpty() || !location.isEmpty() || !company.isEmpty())
			{  
			    request.setAttribute("searchresult", rb.searchrole(role,location,company));
				RequestDispatcher rd = request.getRequestDispatcher("findjob.jsp");
				rd.forward(request, response);
			}
			else 
			{   
				request.setAttribute("searchresult",searchdao.recentjobs());
				RequestDispatcher rd = request.getRequestDispatcher("findjob.jsp");
				rd.forward(request, response);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		}
		
		

}
