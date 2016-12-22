package TripPackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.ListDatabasesIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import TripPackage.NodeClass;

/**
 * Hello world!
 *
 */
public class DBAccess 
{ 
    public static ArrayList<NodeClass> getLocations()
    {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		DB db = mongo.getDB("smart_trip");
		ArrayList<NodeClass> nodes1=new ArrayList<NodeClass>();
		

		
		DBCollection Hash = db.getCollection("LocationF");
		BasicDBObject Query = new BasicDBObject();
		
		Query.put("City","NewYorkCity");
		DBCursor cursor = Hash.find(Query);
		

		System.out.println( "#####" + cursor.count());
		
		while (cursor.hasNext()) {
		  DBObject object = cursor.next();
		  NodeClass tempNode=new NodeClass((String)object.get("Name"),(String)object.get("Cost"),(String)object.get("Time"),(String)object.get("City"),(String)object.get("Lat"),(String)object.get("Lon"),(String)object.get("Zip"),(String)object.get("Website"));
		  nodes1.add(tempNode);
		  System.out.println(tempNode.NodeName+tempNode.Lat+tempNode.Long);
		 }
		/*
		for(NodeClass node : nodes1){
			 System.out.println(node.NodeName+":"+node.Fare+":"+node.Time);
		 }
		*/

		cursor.close();
		mongo.close();
		return nodes1;
    }
		public static ArrayList<NodeClass> getTransports(){
				MongoClient mongo = new MongoClient( "localhost" , 27017 );
				DB db = mongo.getDB("Smart_trip");
				ArrayList<NodeClass> nodes2=new ArrayList<NodeClass>();
				DBCollection edges = db.getCollection("Transport");
				DBCursor cursor1 = edges.find();
				while (cursor1.hasNext()) {
					  DBObject object = cursor1.next();
					  //System.out.println(object.get("name").toString());
					 nodes2.add(new NodeClass(object.get("name").toString(),object.get("Cost").toString(),object.get("Time").toString(),object.get("City").toString(),object.get("Lat").toString(),object.get("Long").toString(),object.get("Zip").toString(),object.get("Website").toString()));
			}
			/*
			 for(NodeClass node : nodes2){
				 System.out.println(node.NodeName+":"+node.Fare+":"+node.Time);
			 }
			 */

				DBCollection connect = db.getCollection("Connectivity");
				DBCursor cursor2= connect.find();
				while (cursor2.hasNext()) {
					  DBObject object = cursor2.next();

				   //  NodeClass node =new NodeClass((String)  object.get("Location1"), (String)  object.get("Location2"),(String)  object.get("Cost"),(String)  object.get("Transport"));
					  
				}
				cursor1.close();
				return nodes2;
		}
		

    
}
