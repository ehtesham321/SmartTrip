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
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
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
		String city = request.getParameter("usercitySelect");
		String cost  = request.getParameter("userbudget");
		String TTime  = request.getParameter("userTime");
		//System.out.println(request.);
		//String STime = request.getParameter("userarivalTime");
		//String DTime = request.getParameter("userdepartureTime");
		
		
		//String TTime =  "hello";
		System.out.println("The time cost time cost");
		System.out.println(cost+city);
		
		ArrayList<PackageClass> plans = RetrievePlans.searchPackages(city,cost,TTime);
		
		//HttpSession session=request.getSession();
		//ArrayList<PackageClass> plans = PlanTrip.searchPackages();
		
		HttpSession session=request.getSession();
		
		//for(int i=0;i<plans.size();i++){
		//	session.setAttribute("plan"+i, plans.get(i));
		//}
		
		session.setAttribute("sessionplans", plans);
		
		request.setAttribute("plansList", plans);
		request.getRequestDispatcher("plans.jsp").forward(request, response);
	}

}
