
package TripPackage;

public class PrintEdge {

	public PrintEdge(EdgeClass Node) {
		// TODO Auto-generated constructor stub
		System.out.print(Node.FromName+"");
		System.out.print(Node.ToName+"");
		System.out.print(Node.City+"");
		System.out.print(Node.Cost+"");
		System.out.print(Node.Time+"");
		

		
	}

	public static void PrintEdge(EdgeClass nnode) {
		
		// TODO Auto-generated method stub
		System.out.print(nnode.FromName+"");
		System.out.print(nnode.ToName+"");
		System.out.print(nnode.City+"");
		System.out.print(nnode.Cost+"");
		System.out.print(nnode.Time+"");
	}

}

