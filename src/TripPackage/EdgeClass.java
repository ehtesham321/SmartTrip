package TripPackage;

public class EdgeClass {

	public String FromName;
	public String ToName;
	public String Time;
	public String Cost;
	public String Means;
	public String City;
	

	
	public EdgeClass(String FName,String TName,String ETime,String ECost,String EMeans,String ECity){
		FromName=FName;
		ToName=TName;
		Time=ETime;
		Cost=ECost;
		Means = EMeans;
		City= ECity;
		
	}

}
