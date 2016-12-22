package TripPackage;

public class NodeClass {

	public String NodeName;
	public String Time;
	public String Cost;
	public String City;
	public String Lat;
	public String Long;
	public String Zip;
	public String Website;
	
	//public NodeClass(String nName,String nTime,String nFare){
	public NodeClass(String NName, String NCost, String NTime, String NCity, String NLat,
			String NLon, String NZip, String NWebsite){
		NodeName=NName;
		Cost=NCost;
		Time=NTime;
		City=NCity;
		Lat=NLat;
		Long=NLon;
		Zip=NZip;
		Website=NWebsite;
		
		
	}
	
	String getLat(){return Lat;}
	void setLat(String Lat){this.Lat=Lat;}
	
	String getLong(){return Lat;}
	void setLong(String Long){this.Long=Long;}
}
