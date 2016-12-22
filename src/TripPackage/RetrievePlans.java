package TripPackage;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RetrievePlans  {
	public static ArrayList<PackageClass> searchPackages(String City,String Cost,String TTime ){
		long startTime = System.currentTimeMillis();
		ArrayList<PackageClass> plans=new ArrayList<PackageClass>();
		
		//City = "LosAngeles";
		ArrayList<NodeClass> Locations = new ArrayList<NodeClass>();
		Locations = Transport.RetrieveNodes(City);
		System.out.println(""+Locations.size());

		
		ArrayList<EdgeClass> Routes = new ArrayList<EdgeClass>();
		Routes = Transport.RetrieveEdges(City);
		System.out.println(""+Routes.size());
		
		
		int i = 1;
		Map<String, Integer> String2Int = new HashMap<String, Integer>();
		for(NodeClass node : Locations){
			System.out.println(node.NodeName);
			String2Int.put(node.NodeName,i);
			i = i+1;
		}
	
		Map<Integer,String> Int2String = new HashMap<>();
		for (Entry<String, Integer> entry : String2Int.entrySet()) {
			Int2String.put(entry.getValue(), entry.getKey());
		   // System.out.println(entry.getKey() + " : "+entry.getValue());
		}
		
		
		ArrayList<Double[]>  NHMap = new ArrayList<Double[]>();
		for (NodeClass node : Locations){
		
			Double Costs = Double.parseDouble(node.Cost);
			Double Times = Double.parseDouble(node.Time);
			double sum = (double) ((Integer) String2Int.get(node.NodeName)).intValue();
			Double[] NHMapedge ={sum,Costs,Times};
			NHMap.add(NHMapedge);
		}
		
		
		ArrayList<Double[]> EHMap = new ArrayList<Double[]>();
		for (EdgeClass edge : Routes){
			
			try{
				
				Double From = (double) ((Integer) String2Int.get(edge.FromName)).intValue();
				Double To = (double) ((Integer) String2Int.get(edge.ToName)).intValue();
				Double Costs = Double.parseDouble(edge.Cost);
				Double Times = Double.parseDouble(edge.Time);
				System.out.println("C"+Costs+"T"+Times+ "f"+From+"C"+To);
				Double[] EHMapedge = {From,To,Costs,Times};
				//Integer[] apedge1 ={String2Int.get(edge.FromName),String2Int.get(edge.ToName),Costs,Times};
				EHMap.add(EHMapedge);
				
			}
				catch(Exception exp){
					System.out.println("---------------An Exception Occurred---------------------");
					System.out.println(exp.getMessage());
			}
			
			}
		
		ArrayList<Integer[]> edges = MakeLists.edges(City,String2Int);
		

		for(Double[] eh : EHMap){
			System.out.print(eh[0]);
			System.out.print(eh[1]);
			System.out.print(eh[2]);
			System.out.print(eh[3]);
			System.out.println();
			
		}
		  
		int[][] adj_matrix = MapArrayList.MapArrayList(EHMap,String2Int.size());
       
		
		
        System.out.println("ADJ MATRIX"+adj_matrix.length);
        //Applies Djikstra and gets the paths
        
        ArrayList<ArrayList<Integer>> finalpaths = dijkstra.dijkstra(adj_matrix);
        
        Set<ArrayList<Integer>> FinalPath = new HashSet<ArrayList<Integer>>(finalpaths);
        
        

        String UserCost= Cost;
        String UserTime= TTime;

        ArrayList<ArrayList<Integer>> FinalPaths1 = PathinBound.Pathinbound(NHMap,EHMap,FinalPath,UserCost,UserTime);
       
        
        //Set<ArrayList<Integer>> FinalPaths1 =  FinalPaths2;
        System.out.println("-----------------------------Final answer-------------------------------");
        //ArrayList<NodeClass> NodePack = new ArrayList<NodeClass>();
        int i1 = 0;
        for (ArrayList<Integer> item : FinalPaths1) {
        	System.out.println(item);
        	ArrayList<NodeClass> NodePack = new ArrayList<NodeClass>();
        	double packageCost = 0;
        	double packageTime = 0;
        	for(Integer EveryItem : item){
        		try{
        		NodeClass nc = Locations.get(EveryItem);
        		//PrintNode.PrintNode(nc);
        		packageCost = packageCost+  Double.parseDouble(nc.Cost);
        		packageTime = packageTime + Double.parseDouble(nc.Time);
        		//int packageCost = packageCost + nc.Cost;
        		NodePack.add(nc);
        		}catch(Exception exp){
					System.out.println("---------------An Exception Occurred---------------------");
					System.out.println(exp.getMessage());
			}
        	}
        	if(packageTime > 1){
        	i1 = i1+1;
        	System.out.println("i issss"+i);
        	Integer hours = (int) (packageTime / 60); //since both are ints, you get an int
        	Integer minutes = (int) (packageTime  % 60);
        	//System.out.printf("%d:%02d", hours, minutes);
        	String Time = hours.toString() + ":" + minutes.toString();
        	plans.add(new PackageClass("Package"+i1,Time,Double.toString(packageCost),NodePack));
        }
        }
        

        
		//PackageClass pack = new PackageClass(null, null, null, null);
		NodeClass nc = new NodeClass(null, null, null, TTime, TTime, TTime, TTime, TTime);
		ArrayList<NodeClass> nodes_nc=new ArrayList<NodeClass>();
		
		System.out.println("---------------Final Nodes---------------------");
		
	
        
		
		
		//if(plans.isEmpty()){
		ArrayList<NodeClass> nodes1=new ArrayList<NodeClass>();
		ArrayList<NodeClass> nodes2=new ArrayList<NodeClass>();
		
		
		String ECity = null;
		nodes1.add(new NodeClass("Empire State Building","90","10", "NewYorkCity","40.748433", "-73.985656","10118","http://www.esbnyc.com/"));
		//nodes1.add(new NodeClass("Bus","0.25","1", ECity, ECity, ECity, ECity, ECity));
		//Transport.insertLocation("High Line", "0.00","120","NewYorkCity", "40.748333", " -74.005", "10011", "http://www.thehighline.org/");
		nodes1.add(new NodeClass("High Line", "15.00","120","NewYorkCity", "40.748333", " -74.005", "10011", "http://www.thehighline.org/"));
		//nodes1.add(new NodeClass("Boat","0.5","1.5", UserTime, UserTime, UserTime, UserTime, UserTime));
		nodes1.add(new NodeClass("Statue of Liberty","120","18", "NewYorkCity", "40.689167", "-74.044444", "10004",  "https://www.nps.gov/stli/index.htm"));
		
		nodes2.add(new NodeClass("Radio City Music Hall","0.00", "90","NewYorkCity", "40.759722", "-73.979167", "10020", "http://www.radiocity.com/"));
		//nodes2.add(new NodeClass("Train","0.25","1"));
		nodes2.add(new NodeClass("Statue of Liberty","180","18","NewYorkCity",  "40.689167", "-74.044444", "10004",  "https://www.nps.gov/stli/index.htm"));
		//nodes2.add(new NodeClass("Walk","0.5","1.5"));
		nodes2.add(new NodeClass( "Museum of Arts and Designs and Design","12.00", "135","NewYorkCity","40.7675","-73.981944","10028",   "http://www.metmuseum.org/" ));
		
		plans.add(new PackageClass("Recommended Package 1","5","30.5",nodes1));
		plans.add(new PackageClass("Recommended Package 2","8","30.5",nodes2));
	

	
		long estimatedTime = System.currentTimeMillis() - startTime;

		System.out.println("Total Time Elapsed:"+ estimatedTime);
		return plans;
		
	}
	
}


