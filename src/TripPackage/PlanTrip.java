package TripPackage;
import java.util.ArrayList;

public class PlanTrip {
	public static ArrayList<PackageClass> searchPackages(){
		ArrayList<PackageClass> plans=new ArrayList<PackageClass>();
		
		
		ArrayList<NodeClass> nodes1=new ArrayList<NodeClass>();
		ArrayList<NodeClass> nodes2=new ArrayList<NodeClass>();
		ArrayList<NodeClass> nodes3=new ArrayList<NodeClass>();
		
		/*
		nodes1=DBAccess.getLocations();
		nodes2=DBAccess.getTransports();
		
		for(int i=0;i<nodes1.size();i++){
			nodes3.add(nodes1.get(i));
			if(i<nodes1.size()-1){
				nodes3.add(nodes2.get(i));
			}
		}
		*/
		/*
		nodes1.add(new NodeClass("Empire State Building","0.5","10"));
		nodes1.add(new NodeClass("Bus","0.25","1"));
		nodes1.add(new NodeClass("Times Square","0.5","0"));
		nodes1.add(new NodeClass("Boat","0.5","1.5"));
		nodes1.add(new NodeClass("Statue of Liberty","0.5","18"));
		
		nodes2.add(new NodeClass("Brooklyn Bridge Park","0.5","10"));
		nodes2.add(new NodeClass("Train","0.25","1"));
		nodes2.add(new NodeClass("Statue of Liberty","0.5","18"));
		nodes2.add(new NodeClass("Walk","0.5","1.5"));
		nodes2.add(new NodeClass("One World Trade Center","0.5","0"));
		
		nodes3.add(new NodeClass("Central Park","0.5","10"));
		nodes3.add(new NodeClass("Bus","0.25","1"));
		nodes3.add(new NodeClass("American Museum of Natural History","0.5","10"));
		nodes3.add(new NodeClass("Walk","0.5","1.5"));
		nodes3.add(new NodeClass("Central Park Zoo","0.5","30"));
		
		
		plans.add(new PackageClass("Package1","6","30.5",nodes1));
		plans.add(new PackageClass("Package2","8","30.5",nodes2));
		plans.add(new PackageClass("Package3","8","42.5",nodes3));
		
		//Experiment
		
		ArrayList<NodeClass> nodes=new ArrayList<NodeClass>();
		for(int i=0;i<nodes.size();i++){
			Tuple.Int2String.put(i, nodes.get(i).NodeName);
		}
		*/
		
		return plans;
	}
}
