//package com.smartrip.NumberGenerator;
package TripPackage;
import java.util.ArrayList;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;


public class Location 
{ 
    public static void main( String[] args )
    {
			@SuppressWarnings("resource")
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
			@SuppressWarnings("deprecation")
			DB db = mongo.getDB("smart_trip");
			ArrayList<NodeClass> nodes1=new ArrayList<NodeClass>();
			  
			 

		DBCollection nodes = db.getCollection("Location");
		
		BasicDBObject document = new BasicDBObject();
		document.put("name", "Statue of Liberty");
		document.put("Cost", "10");
		document.put("Time", "2");
		document.put("zipcode", "12204");
		
		nodes.insert(document);
		
		DBCursor cursor = nodes.find(); 
		while (cursor.hasNext()) {
			  DBObject object = cursor.next();
			  										//String NName, String NCost, String NTime, String NCity, String NLat,String NLon, String NZip, String NWebsite
				 nodes1.add(new NodeClass(object.get("name").toString(),object.get("Cost").toString(),object.get("Time").toString(),object.get("City").toString(),object.get("Lat").toString(),object.get("Long").toString(),object.get("Zip").toString(),object.get("Website").toString()));
				 }
		
		 System.out.println("\nNew York-  Places - Smart Trip");

		for(NodeClass node : nodes1){
			 
			 System.out.println(node.NodeName+" : "+node.Cost+"$ : "+node.Time+"Hrs");
		 }
		
           
    
	
		
		
}
    
}
