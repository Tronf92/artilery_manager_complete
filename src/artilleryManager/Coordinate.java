package artilleryManager;

public class Coordinate {

	private double n;
	private double w;
	
	public Coordinate(double nDegrees, double nMinutes, double nSeconds, double wDegrees, double wMinutes, double wSeconds)
	{
		n = nDegrees + nMinutes / 60 + nSeconds / 3600;
		w = wDegrees + wMinutes / 60 + wSeconds / 3600;
	}
	
	public Coordinate(double n, double w)
	{
		this.n=n;
		this.w=w;
		
	};
	public double getN() {
		return n;
	}
	public void setN(double n) {
		this.n = n;
	}
	public double getW() {
		return w;
	}
	public void setW(double w) {
		this.w = w;
	}
	
	public String toString(){
		return "Coordinate x="+n +" y="+w;
		
	}
}
