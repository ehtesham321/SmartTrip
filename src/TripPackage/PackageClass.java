package TripPackage;

import java.util.ArrayList;

public class PackageClass {
	public String PlanName;
	public String Time;
	public String Fare;
	public ArrayList<NodeClass> nodes;
	
	public PackageClass(String pName,String pTime,String pFare,ArrayList<NodeClass> pnodes){
		PlanName=pName;
		Time=pTime;
		Fare=pFare;
		nodes=pnodes;
		
	}
}
