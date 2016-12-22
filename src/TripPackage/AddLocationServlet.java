package TripPackage;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddLocationServlet
 */
//@WebServlet("/AddLocationServlet")
public class AddLocationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddLocationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Transport.insertLocation(request.getParameter("location"),request.getParameter("cost"), request.getParameter("time"),request.getParameter("selectcity"), request.getParameter("Latitude"), request.getParameter("Longitude"), request.getParameter("pincode"), request.getParameter("Website"));
		
		
		//Transport.insertLocation(","0.00", "90","NewYorkCity", "40.783333", "-73.966667", "10024", "http://www.centralparknyc.org/");
		//ArrayList<NodeClass> nodes=DBAccess.getLocations();
		
		//request.setAttribute("nodes", nodes);
		request.getRequestDispatcher("addLocation.jsp").forward(request, response);
	}

}
