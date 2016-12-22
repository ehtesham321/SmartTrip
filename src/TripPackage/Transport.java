//package com.smartrip.NumberGenerator;
package TripPackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class Transport {
	
	
	
	public static void insert( String name, String cost, String time)
	{
		try{
			//@SuppressWarnings("resource")
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
			//@SuppressWarnings("deprecation")
			DB db = mongo.getDB("smart_trip");
			
			DBCollection edges = db.getCollection("Transportation");
			BasicDBObject document = new BasicDBObject();
			document.put("name", name);
			document.put("Cost", cost);
			document.put("Time", time);
			
			edges.insert(document);
			mongo.close();
		}
		catch(Exception exp){
			System.out.println("---------------An Exception Occurred---------------------");
			System.out.println(exp.getMessage());
		}
	}

    

	public static void insertLocation(String name, String cost, String time, String city) {
		// TODO Auto-generated method stub
		try{
			//@SuppressWarnings("resource")
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
			//@SuppressWarnings("deprecation")
			DB db = mongo.getDB("smart_trip");
			
			DBCollection edges = db.getCollection("LocationF");
			BasicDBObject document = new BasicDBObject();
			document.put("name", name);
			document.put("Cost", cost);
			document.put("Time", time);
			document.put("City", city);
			
			edges.insert(document);
			mongo.close();
		}
		catch(Exception exp){
			System.out.println("---------------An Exception Occurred---------------------");
			System.out.println(exp.getMessage());
		}
	}

	public static void insertTransport(String FromPlace, String ToPlace, String cost, String time, String Means,
			String city) {
		// TODO Auto-generated method stub
		try{
			//@SuppressWarnings("resource")
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
			//@SuppressWarnings("deprecation")
			DB db = mongo.getDB("smart_trip");
			DBCollection edges = db.getCollection("TransportF");
			BasicDBObject document = new BasicDBObject();
			
			document.put("FromPlace",FromPlace);
			document.put("ToPlace", ToPlace);
			document.put("Cost", cost);
			document.put("Time", time);
			document.put("Means", Means);
			document.put("City", city);
			
			edges.insert(document);
			mongo.close();
		}
		catch(Exception exp){
			System.out.println("---------------An Exception Occurred---------------------");
			System.out.println(exp.getMessage());
		}
	}
	
	
	
	
				 

	public static void insertLocation(String name, String cost, String time, String city, String Lat,
			String Lon, String Zip, String Website) {
		// TODO Auto-generated method stub
		try{
			//@SuppressWarnings("resource")
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
			//@SuppressWarnings("deprecation")
			DB db = mongo.getDB("smart_trip");
			
			DBCollection edges = db.getCollection("LocationF");
			BasicDBObject document = new BasicDBObject();
			document.put("Name", name);
			document.put("Cost", cost);
			document.put("Time", time);
			document.put("City", city);
			document.put("Lat", Lat);
			document.put("Lon", Lon);
			document.put("Zip", Zip);
			document.put("Website", Website);
			
			edges.insert(document);
			mongo.close();
		}
		catch(Exception exp){
			System.out.println("---------------An Exception Occurred---------------------");
			System.out.println(exp.getMessage());
		}
		return;
	}



	public static ArrayList<NodeClass> RetrieveNodes(String City) {
		// TODO Auto-generated method stub
		ArrayList<NodeClass> Locations = new ArrayList<NodeClass>();
		
		try{
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
			
				//@SuppressWarnings("deprecation")
				DB db = mongo.getDB("smart_trip");
				ArrayList<NodeClass> nodes2=new ArrayList<NodeClass>();
				
				//Retrieve the Data
				
				DBCollection Hash = db.getCollection("LocationF");
				
				BasicDBObject HashQuery = new BasicDBObject();
				HashQuery.put("City",City);
				DBCursor HashCursor = Hash.find(HashQuery);

				
				Integer i = 0;
				while (HashCursor.hasNext()){
					NodeClass Node = new NodeClass(null, null, null,null,null,null, null, null);
					DBObject object = HashCursor.next();
					Node.NodeName = (String) object.get("Name");
					Node.Cost = (String) object.get("Cost");
					Node.Time = (String) object.get("Time");
					Node.City = (String) object.get("City");
					Node.Zip = (String) object.get("Zip");
					Node.Website = (String) object.get("Website");
					Node.Lat = (String) object.get("Lat");
					Node.Long = (String) object.get("Lon");
					Locations.add(Node);
				}
				HashCursor.close();
				mongo.close();
				}catch(Exception exp){
						System.out.println("---------------An Exception Occurred---------------------");
						System.out.println(exp.getMessage());
				}
		return Locations;
	}

	public static ArrayList<EdgeClass> RetrieveEdges(String City) {
		// TODO Auto-generated method stub
		ArrayList<EdgeClass> Edges = new ArrayList<EdgeClass>();
		
		try{
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
			
				//@SuppressWarnings("deprecation")
				DB db = mongo.getDB("smart_trip");
				ArrayList<NodeClass> nodes2=new ArrayList<NodeClass>();
				
				//Retrieve the Data
				
				DBCollection Hash = db.getCollection("TransportF");
				
				BasicDBObject HashQuery = new BasicDBObject();
				HashQuery.put("City",City);
				DBCursor HashCursor = Hash.find(HashQuery);

				
				Integer i = 0;
				while (HashCursor.hasNext()){
					EdgeClass Node = new EdgeClass(null, null, null,null,null,null);
					DBObject object = HashCursor.next();
					Node.FromName = (String) object.get("FromPlace");
					Node.ToName = (String) object.get("ToPlace");
					Node.Cost = (String) object.get("Cost");
					Node.Time = (String) object.get("Time");
					Node.City = (String) object.get("City");
					Node.Means = (String) object.get("Means");
					Edges.add(Node);
				}
				HashCursor.close();
				mongo.close();
				}catch(Exception exp){
						System.out.println("---------------An Exception Occurred---------------------");
						System.out.println(exp.getMessage());
				}
		return Edges;

	}
}




