package TripPackage;

import java.util.ArrayList;

public class MapArrayList {
	public static int[][] MapArrayList(ArrayList<Double[]> edges, Integer s) {
		System.out.println("u$$$$$$$$$$$$$$$$u");
		//int[][] adj_matrix = new int[edges.size()-1][edges.size()-1];
		//int[][] adj_matrix = new int[edges.size()][edges.size()];
		int[][] adj_matrix = new int[s+1][s+1];
		//System.out.print("adjmatrix size"+adj_matrix.length);
		for(Double[] item: edges){
			System.out.println("u$$$$$$$$$$$$$$$$u");
			int u = item[0].intValue();
			
			int v = item[1].intValue();
			
			int v1 =item[3].intValue();
			System.out.println("u   "+u+"v    "+v+"    v1 "+v1);
			adj_matrix[u][v] = v1;
			
		}
		for(int i =0;i<adj_matrix.length;i++){
			System.out.println("");
			for(int j =0;j<adj_matrix.length;j++){
				System.out.print(adj_matrix[i][j]);
			}
		}
			
		return adj_matrix;
	}

}
