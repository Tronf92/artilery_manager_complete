package artilleryManager;

public interface IGun {

	double getRange();
	int getAmmo();
	void setAmmo(int amount);
	void setPosition(Coordinate position);
	Coordinate getPosition();
}
