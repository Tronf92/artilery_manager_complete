package artilleryManager;

public class RealGun extends Gun implements IRealGun {

	private int ID;

	public RealGun(int ID, double range, int ammo, Coordinate position) {
		super(range, ammo, position);
		this.ID = ID;
	}

	@Override
	public int getId() {
		return ID;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RealGun) {
			RealGun realGun = (RealGun) obj;
			if (realGun.getId() == this.getId()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		//Integer id = new Integer(ID);
		return toString().hashCode();
	}

	@Override
	public String toString() {
		//System.out.println("RealGun [ID=" + ID + ", getRange()=" + getRange() + ", getAmmo()=" + getAmmo() + ", getPosition()="
				//+ getPosition() + "]");
		return "RealGun [ID=" + ID + ", getRange()=" + getRange() + ", getAmmo()=" + getAmmo() + ", getPosition()="
				+ getPosition() + "]";
	}

	@Override
	public int compareTo(IRealGun o) {
		return ID - o.getId();
	}

}
