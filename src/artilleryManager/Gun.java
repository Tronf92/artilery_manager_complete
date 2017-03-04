package artilleryManager;

public abstract class Gun implements IGun {

	private int ammo;
	private double range;
	private Coordinate position;

	public Gun(double range, int ammo, Coordinate position) {
		this.range = range;
		this.ammo = ammo;
		this.position = position;
	}

	@Override
	public double getRange() {
		return range;
	}

	@Override
	public int getAmmo() {
		return ammo;
	}

	@Override
	public void setAmmo(int amount) {
		ammo = amount;
	}

	@Override
	public void setPosition(Coordinate position) {
		this.position = position;
	}

	@Override
	public Coordinate getPosition() {
		return position;
	}

	public String toString() {
		return "Gun:\nammo= " + ammo + " range= " + range + " position= " + position;
	}

}
