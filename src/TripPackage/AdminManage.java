package TripPackage;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminManage
 */
@WebServlet("/AdminManage")
public class AdminManage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminManage() {
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
		
		if ("team1".equals(request.getParameter("LoginID")) && "team1".equals(request.getParameter("Pwd"))) {
			
			HttpSession session=request.getSession();
			
			//NodeClass currentLocation=new NodeClass(request.getParameter("location"),request.getParameter("time"),request.getParameter("cost"));
			//currentLocation.setLat(request.getParameter("Latitude"));
			//currentLocation.setLat(request.getParameter("Longitude"));
			
			ArrayList<NodeClass> nodes=DBAccess.getLocations();
			
			request.setAttribute("nodes", nodes);
			request.getRequestDispatcher("addLocation.jsp").forward(request, response);
		}
		else{
			request.setAttribute("warning", "Invalid LoginID or Password!");
		    request.getRequestDispatcher("AdminLogin.jsp").forward(request, response);
		}
	}
	
	//var contentstring = '<%= session.getAttribute("contentstring") %>';
	//var regionlocation = '<%= session.getAttribute("regionlocation") %>';

}
