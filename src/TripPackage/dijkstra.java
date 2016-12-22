package TripPackage;

import java.util.ArrayList;

public class dijkstra {
//static final int V=8;
static int minDistance(int dist[], Boolean sptSet[],int V)
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
		int V = graph.length;
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
		         int u = minDistance(dist, sptSet, V);

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
}