
package TripPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import SearchLogic.SmartTrip.MapArrayList;

public class Tuple {
	
	public static Map<String, List<String>> peopleByForename = new HashMap<String, List<String>>();
	public static Map<String, Integer> String2Int = new HashMap<String, Integer>();
	public static Map<Integer, String> Int2String = new HashMap<Integer, String>();
	
	public static void getPath() {
		// TODO Auto-generated method stub
		    
			
		/*
		// populate it
		Int2String.put(String2Int.get("Location1"), "Location1");
		Int2String.put(String2Int.get("Location2"), "Location2");
		Int2String.put(String2Int.get("Location3"), "Location3");
		Int2String.put(String2Int.get("Location4"), "Location4");
		*/
		
		// populate it
		/*
		String2Int.put("Location1", new Integer(0));
		String2Int.put("Location2", new Integer(1));
		String2Int.put("Location3", new Integer(2));
		String2Int.put("Location4", new Integer(3));
		*/
		
		for(int i=0;i<Int2String.size();i++){
			String2Int.put(Int2String.get(i), new Integer(i));
		}
		
		
		
		//HashMap<String,List<Integer>> NHMap = new HashMap<String,List<Integer>>();
		ArrayList<Integer[]>  NHMap = new ArrayList<Integer[]>();
		Integer[] NHMapedge1 ={String2Int.get("Location1"),100,30};
		Integer[] NHMapedge2 ={String2Int.get("Location2"),20,40};
		Integer[] NHMapedge3 ={String2Int.get("Location4"),30,15};
		Integer[] NHMapedge4 ={String2Int.get("Location3"),140,60};
		//edges.add(edge);
		NHMap.add(NHMapedge1);
		NHMap.add(NHMapedge2);
		NHMap.add(NHMapedge3);
		NHMap.add(NHMapedge4);
		
		
		
		
		//HashMap<String,List<Integer>> EHMap = new HashMap<String,List<Integer>>();
		ArrayList<Integer[]> EHMap = new ArrayList<Integer[]>();
		Integer[] EHMapedge1 ={String2Int.get("Location1"),String2Int.get("Location2"),10,30};
		Integer[] EHMapedge2 ={String2Int.get("Location2"),String2Int.get("Location3"),20,40};
		Integer[] EHMapedge3 ={String2Int.get("Location4"),String2Int.get("Location4"),30,50};
		Integer[] EHMapedge4 ={String2Int.get("Location3"),String2Int.get("Location2"),40,60};
		//edges.add(edge);
		EHMap.add(EHMapedge1);
		EHMap.add(EHMapedge2);
		EHMap.add(EHMapedge3);
		EHMap.add(EHMapedge4);
		
		ArrayList<Integer[]> edges = new ArrayList<Integer[]>();
		Integer[] edge ={String2Int.get("Location1"),String2Int.get("Location2"),10};
		Integer[] edge1 ={String2Int.get("Location2"),String2Int.get("Location3"),20};
		Integer[] edge2 ={String2Int.get("Location1"),String2Int.get("Location3"),30};
		Integer[] edge4 ={String2Int.get("Location3"),String2Int.get("Location4"),40};
		Integer[] edge5 ={String2Int.get("Location4"),String2Int.get("Location3"),40};
		
		
		edges.add(edge);
		edges.add(edge1);
		edges.add(edge2);
		edges.add(edge4);
		edges.add(edge5);
		
		int edges1[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 0},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0}
           };
           
           int edges2[][] = new int[][]{{0, 10, 30, 0},
        	                            { 0, 0, 20, 0},
        	                            { 0, 4, 0, 40},
        	                            { 12, 0, 5, 0}};
               
		   //int[][] adj_matrix = MapArrayList(edges1);
           int[][] adj_matrix = MapArrayList(edges);
		for(int i=0;i<5;i++){
			//System.out.println("");
			for(int j=0;j<5;j++){
				
				//System.out.print(adj_matrix[i][j]);
			}
		}
		
		
		//dijkstra(edges1);
		//System.out.print(edges2);
		//System.out.println("Ehtesham");
		ArrayList<ArrayList<Integer>> finalpaths = dijkstra(adj_matrix);
		 for (ArrayList<Integer> item : finalpaths) {  
			 System.out.println("");
			 	for(Integer node: item)
			 	{	
			 		System.out.print(Int2String.get(node)+"->");
			 	}
		
		 }
		 int cost = 210;
		 int time = 190;
		 //ArrayList<ArrayList<Integer>> finalp1aths1 = Pathinbound(finalp1aths1);
		 ArrayList<ArrayList<Integer>> finalp1aths1 = Pathinbound(NHMap,EHMap,finalpaths,cost,time);
		 System.out.println("");
		 System.out.println("-----------------------------Final answer-------------------------------");
		 for (ArrayList<Integer> item : finalp1aths1) {   
				System.out.println(item);
				
		 }
				 
	}
	private static ArrayList<ArrayList<Integer>> Pathinbound(ArrayList<Integer[]> NHMap, ArrayList<Integer[]> EHMap,
			ArrayList<ArrayList<Integer>> finalpaths, int cost, int time) {
		
		ArrayList<ArrayList<Integer>> paths =  finalpaths;
		
	
		ArrayList<ArrayList<Integer>> FPaths = new ArrayList<ArrayList<Integer>>();
		
		for(ArrayList<Integer> path: paths){
			int Ncost = 0;
			int Ecost = 0;
			int Ntime = 0;
			int Etime = 0;
			for(Integer item1: path){
				
				//List<Integer> val= NHMap.get("Ehte");
				Integer[] var = NHMap.get(item1);
				int time1 = var[2];
				int cost1 = var[1];
				Ncost = Ncost + cost1;
				Ntime = Ntime + time1;
				
				
				
				Integer[] var1 = EHMap.get(item1);
				int time2 = var1[3];
				int cost2 = var1[2];
				
				Ecost = Ecost + cost2;
				Etime = Etime + time2;
				
			}
			int Tcost = Ecost + Ncost;
			int Ttime = Etime + Ntime;
			ArrayList<Integer> sendcost = new ArrayList<Integer>();
			Integer sendtime;
			System.out.println("---------");
			System.out.println(path);
			System.out.println(Tcost);
			System.out.println(Ttime);
			if(Tcost < cost*1.3 && Tcost > cost*0.8 && Ttime < time*1.3 && Ttime > time*0.8){
				sendcost.add(Tcost);
				sendcost.add(Ttime);
			    FPaths.add(path); 
			    FPaths.add(sendcost); 		
				}
				
			
		
		}
		//Checks the path cost with the total time

		
		
		// TODO Auto-generated method stub
		return FPaths;
	}
	static final int V=4;
	 static int minDistance(int dist[], Boolean sptSet[])
	 {
	     // Initialize min value
	     int min = Integer.MAX_VALUE, min_index=-1;

	     for (int v = 0; v < V; v++)
	         if (sptSet[v] == false && dist[v] <= min)
	         {
	             min = dist[v];
	             min_index = v;

	         }

	     return min_index;
	 }

		public static ArrayList<ArrayList<Integer>> dijkstra(int[][] graph) {
			//void dijkstra(int graph[][])
			// {	
			
			//obj
				 ArrayList<ArrayList<Integer>> obj = new ArrayList<ArrayList<Integer>>();
				 ArrayList<Integer[]> obj1 = new ArrayList<Integer[]>();
				 
				 //System.out.print(obj);
			     
				 for(int src = 0; src < graph.length-1 ; src++)
			     {
					 for(ArrayList<Integer> item : obj) { 
					  //System.out.print(item);
					 }
				 
			     int dist[] = new int[V]; // The output array. dist[i] will hold
			                              // the shortest distance from src to i

			     // sptSet[i] will true if vertex i is included in shortest
			     // path tree or shortest distance from src to i is finalized
			     Boolean sptSet[] = new Boolean[V];

			     // Initialize all distances as INFINITE and stpSet[] as false
			     for (int i = 0; i < V; i++)
			     {
			         dist[i] = Integer.MAX_VALUE;
			         sptSet[i] = false;
			     }

			     // Distance of source vertex from itself is always 0
			     dist[src] = 0;
			     //Ehtesham

			    
			     ArrayList<Integer> path2 = new ArrayList<Integer>();
			     ArrayList<Integer> temp = new ArrayList<Integer>();
			     // Find shortest path for all vertices
			     for (int count = 0; count < V-1; count++)
			     {	 
			    	 //path
			    	 //ArrayList<Integer> path2 = new ArrayList<Integer>();
			         // Pick the minimum distance vertex from the set of vertices
			         // not yet processed. u is always equal to src in first
			         // iteration.
			         int u = minDistance(dist, sptSet);

			         // Mark the picked vertex as processed
			         sptSet[u] = true;

			         // Update dist value of the adjacent vertices of the
			         // picked vertex.

					for (int v = 0; v < V; v++)
			        	 //System.out.print(v);
			             // Update dist[v] only if is not in sptSet, there is an
			             // edge from u to v, and total weight of path from src to
			             // v through u is smaller than current value of dist[v]
						
			             if (!sptSet[v] && graph[u][v]!=0 &&
			                     dist[u] != Integer.MAX_VALUE &&
			                     dist[u]+graph[u][v] < dist[v]){
			            	 
			                	 dist[v] = dist[u] + graph[u][v];
			                	 //System.out.print(v);
			                	 //System.out.print(u);
			                	 path2.add(v);
			                	 //path3.add(v);
			                	 System.out.print(v);
			                	 
			                	
			                 }

					        obj.add(new ArrayList<>(path2));

			            
				} 
			    
			   } 
			     //print the constructed distance array
			     //printSolution(dist, V);
				 for (ArrayList<Integer> item : obj) {   
						System.out.println(item);
						
				 }
				return obj;
				
			 }

		public static int[][] MapArrayList(ArrayList<Integer[]> edges) {
			int[][] adj_matrix = new int[edges.size()-1][edges.size()-1];
			
		
			// TODO Auto-generated constructor stub
			//for(int i = 0; i< edges.size() ;i++){}
			
			
			for(Integer[] item: edges){
				int u = item[0];
				int v = item[1];
				adj_matrix[u][v] = item[2];
			}
			/*
			//for string
			for(String[] item: edges){
				int u = Integer.parseInt(item[0]);
				int v = Integer.parseInt(item[1]);
				adj_matrix[u][v] = Integer.parseInt(item[2]);
			}
			*/		
				
			return adj_matrix;
		}

	}
