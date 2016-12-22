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
 * Servlet implementation class Plans
 */
@WebServlet("/Plans")
public class Plans extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Plans() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String selectedplan = request.getParameter("action");
		HttpSession session=request.getSession();
		ArrayList<PackageClass> plans =(ArrayList<PackageClass>)session.getAttribute("sessionplans");
		
		for(int i=0;i<plans.size();i++){
			PackageClass plan=plans.get(i);
			if(plan.PlanName.equals(selectedplan)){
				request.setAttribute("nodes", plan.nodes);
				request.setAttribute("total_time", plan.Time);
				request.setAttribute("total_cost", plan.Fare);
				break;
			}
		}
		
		
		request.getRequestDispatcher("details.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}

}
