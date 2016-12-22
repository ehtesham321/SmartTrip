package TripPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class MakeLists {
	
	public static Map<String, Integer> String2Int(String City) {
	
		// TODO Auto-generated method stub
		Map<String, Integer> String2 = new HashMap<String, Integer>();

		try{
			
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
			
			
				//@SuppressWarnings("deprecation")
			DB db = mongo.getDB("smart_trip");
			ArrayList<NodeClass> nodes2=new ArrayList<NodeClass>();
				
				//Make Hashmaps
			DBCollection Hash = db.getCollection("TestLocation1");
			BasicDBObject Query = new BasicDBObject();
			Query.put("City",City);
			DBCursor HashCursor = Hash.find(Query);

			
			System.out.println("HashCursor" + HashCursor.count());
			Integer i = 0;
			while (HashCursor.hasNext()){
				//System.out.println("---------------SUCCESS---------------------");
				System.out.println(HashCursor.next().get("Name"));
				DBObject object = HashCursor.next();
				String2.put(object.get("Name").toString(), new Integer(i));
				i =  i + 1;
				}
			
				//Make Arraylist for the transport( calculating the path)
			System.out.println("size String2" + String2.size());
			mongo.close();
				}catch(Exception exp){
						System.out.println("---------------An Exception Occurred---------------------");
						System.out.println(exp.getMessage());
				}
		
		System.out.println("size String2" + String2.size());
		return String2;
	}
	

	public static ArrayList<Integer[]> edges(String City, Map<String, Integer> String2Int) {
		// TODO Auto-generated method stub
		//ArrayList<Integer[]> edges = MakeLists.edges(City,String2Int);
		
		ArrayList<Integer[]> EdgesRet = new ArrayList<Integer[]>();
		
		try{
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
			
				//@SuppressWarnings("deprecation")
				DB db = mongo.getDB("smart_trip");
				ArrayList<NodeClass> nodes2=new ArrayList<NodeClass>();
				/*
				//Make Hashmaps
				DBCollection Hash = db.getCollection("TestLocation");
				BasicDBObject HashQuery = new BasicDBObject();
				HashQuery.put("City",City);
				DBCursor HashCursor = Hash.find(HashQuery).limit(5);
				
				Integer i = 0;
				while (HashCursor.hasNext()){
					
					DBObject object = HashCursor.next();
					System.out.println("HashCursor" + object.get("name"));
					String2Int.put(object.get("name").toString(), new Integer(i));
					//Int2String.put(new Integer(i), object.get("name").toString());
					i++;
				}
			
			
				*/
				//Make Arraylist for the transport( calculating the path)
				
				
				DBCollection edges = db.getCollection("TestTransport4");
				BasicDBObject whereQuery = new BasicDBObject();
				whereQuery.put("City",City);
				DBCursor cursor1 = edges.find(whereQuery);
				System.out.println("Cursor1" +cursor1.count());
				while (cursor1.hasNext()) {
					
					System.out.println(cursor1.next().get("FromPlace").toString()+cursor1.next().get("ToPlace").toString());
					System.out.println(cursor1.next().get("Time"));
					DBObject object = cursor1.next();
					Integer Cost = Integer.parseInt(object.get("Cost").toString());
					Integer Time = Integer.parseInt(object.get("Time").toString());
					Integer[] EHMapedge1 ={String2Int.get(object.get("FromPlace")),String2Int.get(object.get("ToPlace")),Time};
					EdgesRet.add(EHMapedge1);
						  
					//nodes2.add(new NodeClass(object.get("name").toString(),object.get("Time").toString(),object.get("Cost").toString()));
				}
				
				 mongo.close();
				}catch(Exception exp){
						System.out.println("---------------An Exception Occurred---------------------");
						System.out.println(exp.getMessage());
				}
		System.out.println("size edgesRet" + EdgesRet.size());
		return EdgesRet;
	
	}

	
	

}
