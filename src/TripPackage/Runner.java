package TripPackage;

public class Runner {
	public static void main(String args[]){
		
		 
		/*
		Transport.insertLocation("Empire State Building", "31.00", "90","NewYorkCity");
		Transport.insertLocation("Central Park Zoo", "15.00", "90","NewYorkCity");
		Transport.insertTrans("Times Square","Central Park Zoo", "3.00", "30","Train","NewYorkCity");
		
		Transport.insert("Test", "10.05", "1");
		
		
		
		Transport.insertLocation("Central Park","0.00", "90","NewYorkCity", "40.783333", "-73.966667", "10024", "http://www.centralparknyc.org/");
		Transport.insertLocation("Empire State Building","31.00", "75","NewYorkCity", "40.748433", "-73.985656", "10118", "http://www.esbnyc.com/");
		Transport.insertLocation("Statue of Liberty","5.00", "90","NewYorkCity", " 40.689167", "-74.044444", "10004", "https://www.nps.gov/stli/index.htm");
		Transport.insertLocation("Museum of Arts and Designs and Design", "12.00", "35","NewYorkCity","40.7675", "-73.981944", "10028", "http://www.metmuseum.org/");
		Transport.insertLocation("Grand Central Terminal", "0.00", "60","NewYorkCity", "40.7528","-73.976522", "10017", "http://www.grandcentralterminal.com/");
		Transport.insertLocation("Port Authority Bus Terminal", "0.00", "45", "NewYorkCity", "40.756667", "-73.991111", "10018", "http://www.panynj.gov/");
		Transport.insertLocation("China Town", "10.00", "25","NewYorkCity", "40.714722", "-73.997222", "10013", "NA");
		Transport.insertLocation("Radio City Music Hall","0.00", "90","NewYorkCity", "40.759722", "-73.979167", "10020", "http://www.radiocity.com/");
		Transport.insertLocation("Little Italy", "0.00","80", "NewYorkCity", "40.719141", " -73.997327", "10013", "http://littleitalynyc.com/");
		Transport.insertLocation("High Line", "0.00","120","NewYorkCity", "40.748333", " -74.005", "10011", "http://www.thehighline.org/");
		
		
		Transport.insertTransport("China Town", "Radio City Music Hall","3","25", "Train", "NewYorkCity");
		Transport.insertTransport("China Town", "Little Italy","0.00","5", "Walk", "NewYorkCity");
		Transport.insertTransport("China Town", "High Line","3","40", "Train", "NewYorkCity");

		Transport.insertTransport("Radio City Music Hall", "Little Italy","3","25", "Train", "NewYorkCity");
		Transport.insertTransport("Radio City Music Hall", "High Line","3","25", "Train", "NewYorkCity");

		Transport.insertTransport("Little Italy", "High Line","3","30", "Train", "NewYorkCity");
		
		Transport.insertTransport("Empire State Building", "Statue of Liberty","3","25", "Train", "NewYorkCity");
		Transport.insertTransport("Empire State Building", "Museum of Arts and Design","3","15", "Train", "NewYorkCity");
		Transport.insertTransport("Empire State Building", "Grand Central Terminal","0.00","15", "Walk", "NewYorkCity");
		Transport.insertTransport("Empire State Building", "Port Authority Bus Terminal","0.00","20", "Walk", "NewYorkCity");
	    Transport.insertTransport("Empire State Building", "China Town","3","20", "Train", "NewYorkCity");
		Transport.insertTransport("Empire State Building", "Radio City Music Hall","0.00","25", "Walk", "NewYorkCity");
		Transport.insertTransport("Empire State Building", "Little Italy","3","20", "Train", "NewYorkCity");
		Transport.insertTransport("Empire State Building", "High Line","3","20", "Train", "NewYorkCity");
				
		Transport.insertTransport("Museum of Arts and Design", "Grand Central Terminal","3","20", "Train", "NewYorkCity");
		Transport.insertTransport("Museum of Arts and Design", "Port Authority Bus Terminal","3","10", "Train", "NewYorkCity");
		Transport.insertTransport("Museum of Arts and Design", "China Town","3","25", "Train", "NewYorkCity");
		Transport.insertTransport("Museum of Arts and Design", "Radio City Music Hall","0.00","5", "Walk", "NewYorkCity");
		Transport.insertTransport("Museum of Arts and Design", "Little Italy","3","25", "Train", "NewYorkCity");
		Transport.insertTransport("Museum of Arts and Design", "High Line","3","25", "Train", "NewYorkCity");

					
		Transport.insertTransport("Central Park", "Empire State Building","3","20", "Train", "NewYorkCity" );
		Transport.insertTransport("Central Park", "Statue of Liberty","3","35", "Train", "NewYorkCity" );
		Transport.insertTransport("Central Park", "Museum of Arts and Design","3","15", "Train", "NewYorkCity");
		Transport.insertTransport("Central Park", "Grand Central Terminal","5.50","15", "Train", " NewYorkCity ");
		Transport.insertTransport("Central Park", "Port Authority Bus Terminal","3","15", "Train", "NewYorkCity");
		Transport.insertTransport("Central Park", "China Town","5.50","20", "Train", "NewYorkCity");
		Transport.insertTransport("Central Park", "Radio City Music Hall","3","15", "Train", "NewYorkCity");
		Transport.insertTransport("Central Park", "Little Italy","3","30", "Train", "NewYorkCity");
		Transport.insertTransport("Central Park", "High Line","3","30", "Train", "NewYorkCity");

		
		Transport.insertTransport("Statue of Liberty", "Museum of Arts and Design","3","30", "Train", "NewYorkCity");
		Transport.insertTransport("Statue of Liberty", "Grand Central Terminal","3","30", "Train", "NewYorkCity");
		Transport.insertTransport("Statue of Liberty", "Port Authority Bus Terminal","3","25", "Train", "NewYorkCity");
		Transport.insertTransport("Statue of Liberty", "China Town","3","15", "Train", "NewYorkCity");
		Transport.insertTransport("Statue of Liberty", "Radio City Music Hall","3","30", "Train", "NewYorkCity");
		Transport.insertTransport("Statue of Liberty", "Little Italy","3","20", "Train", "NewYorkCity");
		Transport.insertTransport("Statue of Liberty", "High Line","3","40", "Train", "NewYorkCity");

		

		Transport.insertTransport("Grand Central Terminal", "Port Authority Bus Terminal","3","10", "Train", "NewYorkCity");
		Transport.insertTransport("Grand Central Terminal", "China Town","3","20", "Train", "NewYorkCity");
		Transport.insertTransport("Grand Central Terminal", "Radio City Music Hall","3","15", "Train", "NewYorkCity");
		Transport.insertTransport("Grand Central Terminal", "Little Italy","3","20", "Train", "NewYorkCity");
		Transport.insertTransport("Grand Central Terminal", "High Line","3","25", "Train", "NewYorkCity");
		
		
		Transport.insertTransport("Port Authority Bus Terminal", "China Town","3","25", "Train", "NewYorkCity");
		Transport.insertTransport("Port Authority Bus Terminal", "Radio City Music Hall","3","15", "Train", "NewYorkCity");
		Transport.insertTransport("Port Authority Bus Terminal", "Little Italy","3","25", "Train", "NewYorkCity");
		Transport.insertTransport("Port Authority Bus Terminal", "High Line","3","25", "Train", "NewYorkCity");
	    
		
	  
	
		Transport.insertLocation("Hollywood Sign", "0.00", "30", "LosAngeles", "34.134061", "-118.321592", "90068"," http://hollywoodsign.org/ ");
		Transport.insertLocation("Walt Disney Concert Hall", "10.00", "60", "LosAngeles","34.055278", "-118.25","90012","");
		Transport.insertLocation("Capitol Records Building", "0.00", "90", "LosAngeles", "34.103085", " -118.326189","90028"," http://www.capitolrecords.com/ ");
		Transport.insertLocation("TCL Chinese Theatre", "0.00", "150", "LosAngeles","34.101944", " -118.340972","90028"," http://www.tclchinesetheatres.com/ ");
		Transport.insertLocation("Dolby Theatre", "0.00", "150", "LosAngeles", "34.102708", "-118.340139","90028"," https://www.dolbytheatre.com/ ");
		Transport.insertLocation("Griffith Observatory", "0.00", "45", "LosAngeles", "34.11856", "-118.30037","90027"," http://www.griffithobservatory.org/ ");
		Transport.insertLocation ("Getty Center", "0.00", "50", "LosAngeles", "34.0775", "-118.475","90049"," http://www.getty.edu/visit/center/ ");
		Transport.insertLocation("Theme Building", "0.00", "45", "LosAngeles", "33.9441", "-118.4024","90045","");
		Transport.insertLocation("Hollywood Bowl",  "50.00", "90", "LosAngeles", "34.112778", "-118.338889", "90068", "http://www.hollywoodbowl.com/ ");
		Transport.insertLocation("Los Angeles City Hall", "0.00", "60", "LosAngeles", "34.0536", "-118.243", "90012", "");
				
				
		Transport.insertTransport("Hollywood Sign","Walt Disney Concert Hall","10.00","25","Car","LosAngeles");
		Transport.insertTransport("Hollywood Sign","Capitol Records Building","10.00","20","Car","LosAngeles");
		Transport.insertTransport("Hollywood Sign","TCL Chinese Theatre","10.00","25","Car","LosAngeles");
		Transport.insertTransport("Hollywood Sign","Dolby Theatre","10.00","25","Car","LosAngeles");
		Transport.insertTransport("Hollywood Sign","Griffith Observatory","10.00","20","Car","LosAngeles");
		Transport.insertTransport("Hollywood Sign","Getty Center","10.00","25","Car","LosAngeles");
		Transport.insertTransport("Hollywood Sign","Theme Building","10.00","25","Car","LosAngeles");
		Transport.insertTransport("Hollywood Sign","Hollywood Bowl","10.00","20","Car","LosAngeles");
		Transport.insertTransport("Hollywood Sign","Los Angeles City Hall","10.00","25","Car","LosAngeles");

		Transport.insertTransport("Capitol Records Building","TCL Chinese Theatre","10.00","25","Car","LosAngeles");
		Transport.insertTransport("Capitol Records Building","Dolby Theatre","10.00","25","Car","LosAngeles");
		Transport.insertTransport("Capitol Records Building","Griffith Observatory","10.00","20","Car","LosAngeles");
		Transport.insertTransport("Capitol Records Building","Getty Center","10.00","25","Car","LosAngeles");
		Transport.insertTransport("Capitol Records Building","Theme Building","10.00","25","Car","LosAngeles");
		Transport.insertTransport("Capitol Records Building","Hollywood Bowl","10.00","20","Car","LosAngeles");
		Transport.insertTransport("Capitol Records Building","Los Angeles City Hall","10.00","25","Car","LosAngeles");

		Transport.insertTransport("TCL Chinese Theatre","Dolby Theatre","10.00","25","Car","LosAngeles");
		Transport.insertTransport("TCL Chinese Theatre","Griffith Observatory","10.00","20","Car","LosAngeles");
		Transport.insertTransport("TCL Chinese Theatre","Getty Center","10.00","25","Car","LosAngeles");
		Transport.insertTransport("TCL Chinese Theatre","Theme Building","10.00","25","Car","LosAngeles");
		Transport.insertTransport("TCL Chinese Theatre","Hollywood Bowl","10.00","20","Car","LosAngeles");
		Transport.insertTransport("TCL Chinese Theatre","Los Angeles City Hall","10.00","25","Car","LosAngeles");

		Transport.insertTransport("Dolby Theatre","Griffith Observatory","10.00","20","Car","LosAngeles");
		Transport.insertTransport("Dolby Theatre","Getty Center","10.00","25","Car","LosAngeles");
		Transport.insertTransport("Dolby Theatre","Theme Building","10.00","25","Car","LosAngeles");
		Transport.insertTransport("Dolby Theatre","Hollywood Bowl","10.00","20","Car","LosAngeles");
		Transport.insertTransport("Dolby Theatre","Los Angeles City Hall","10.00","25","Car","LosAngeles");

		Transport.insertTransport("Griffith Observatory","Getty Center","10.00","25","Car","LosAngeles");
		Transport.insertTransport("Griffith Observatory","Theme Building","10.00","25","Car","LosAngeles");
		Transport.insertTransport("Griffith Observatory","Hollywood Bowl","10.00","20","Car","LosAngeles");
		Transport.insertTransport("Griffith Observatory","Los Angeles City Hall","10.00","25","Car","LosAngeles");

		Transport.insertTransport("Getty Center","Theme Building","10.00","25","Car","LosAngeles");
		Transport.insertTransport("Getty Center","Hollywood Bowl","10.00","20","Car","LosAngeles");
		Transport.insertTransport("Getty Center","Los Angeles City Hall ","10.00","25","Car","LosAngeles");

		Transport.insertTransport("Theme Building","Hollywood Bowl","10.00","20","Car","LosAngeles");
		Transport.insertTransport("Theme Building","Los Angeles City Hall ","10.00","25","Car","LosAngeles");

		Transport.insertTransport("Hollywood Bowl","Los Angeles City Hall ","10.00","25","Car","LosAngeles");
				
	 */
	}
}
