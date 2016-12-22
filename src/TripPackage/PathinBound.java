package TripPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class PathinBound {

	static ArrayList<ArrayList<Integer>> Pathinbound(ArrayList<Double[]> nHMap, ArrayList<Double[]> eHMap,
			Set<ArrayList<Integer>> finalPath, String cost, String time) {
		System.out.println("-----------------------------Final answer-------------------------------");
		System.out.println(cost+time);
		Integer cos = Integer.parseInt(cost);
		Integer tim = Integer.parseInt(time);

		Set<ArrayList<Integer>> paths =  finalPath;

	
		ArrayList<ArrayList<Integer>> FPaths = new ArrayList<ArrayList<Integer>>();
		
		//To add the paths that agree with cost and time
		PackageClass pack = new PackageClass(null, null, null, null);
		
		for(ArrayList<Integer> path: paths){
			double Ncost = 0;
			double Ecost = 0;
			double Ntime = 0;
			double Etime = 0;
			for(Integer item1: path){
				System.out.println(item1);
				item1= item1 -1;
				//List<Integer> val= NHMap.get("Ehte");
				Double[] var = nHMap.get(item1);
				//Integer[] var = nHMap.get(item1);
				Double time1 = var[2];
				Double cost1 = var[1];
				Ncost = Ncost + cost1;
				Ntime = Ntime + time1;
				//System.out.println("Ncost"+Ncost);
				//System.out.println("Ntime"+Ntime);
				//the edges are being calculated twice
				Double[] var1 = eHMap.get(item1);
				Double time2 = var1[3];
				Double cost2 = var1[2];
				
				Ecost = Ecost + cost2;
				Etime = Etime + time2;
				//System.out.println("Ecost"+Ecost);
				//System.out.println("Etime"+Etime);
				
			}
			double Tcost = Ecost + Ncost;
			System.out.println("Tcost"+Tcost);
			
			double Ttime = Etime + Ntime;
			System.out.println("Ttime"+Ttime);
			ArrayList<Integer> sendcost = new ArrayList<Integer>();
			Integer sendtime;
			System.out.println("---------");
			System.out.println(path);
			System.out.println(Tcost);
			System.out.println(Ttime);
		
			//Checks the path cost with the total time
			if(Tcost < cos*1.3 && Tcost > cos*0.8 && Ttime < tim*1.3 && Ttime > tim*0.8){
				//sendcost.add(Tcost);
				//sendcost.add(Ttime);
			    FPaths.add(path); 
			    FPaths.add(sendcost); 	
			    
				}
				
		}
		

		// TODO Auto-generated method stub
		return FPaths;
	}

}
