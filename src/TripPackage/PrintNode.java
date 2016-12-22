package TripPackage;

public class PrintNode {

	public PrintNode(NodeClass Node) {
		// TODO Auto-generated constructor stub
		System.out.print(Node.NodeName+"");
		System.out.print(Node.City+"");
		System.out.print(Node.Cost+"");
		System.out.print(Node.Time+"");
		
		System.out.print(Node.Lat+"");
		System.out.print(Node.Long+"");
		System.out.print(Node.Zip+"");
		System.out.print(Node.Website+"");
		
		
	}

	public static void PrintNode(NodeClass nnode) {
		
		// TODO Auto-generated method stub
		System.out.print(nnode.NodeName+"");
		System.out.print(nnode.City+"");
		System.out.print(nnode.Cost+"");
		System.out.print(nnode.Time+"");
		
		System.out.print(nnode.Lat+"");
		System.out.print(nnode.Long+"");
		System.out.print(nnode.Zip+"");
		System.out.print(nnode.Website+"");
	}

}
