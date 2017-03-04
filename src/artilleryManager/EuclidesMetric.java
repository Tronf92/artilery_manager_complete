package artilleryManager;

public class EuclidesMetric {
	
 private static double transferConstant = 111;
 public static double distance(Coordinate a,Coordinate b){
	 return transferConstant * Math.sqrt(Math.pow(b.getN()-a.getN(), 2)-Math.pow(b.getW()-a.getW(),2));
 }
}
