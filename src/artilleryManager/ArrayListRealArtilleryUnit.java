package artilleryManager;

import java.util.ArrayList;

public class ArrayListRealArtilleryUnit extends RealArtilleryUnit {

	private ArrayList<IRealGun> guns = new ArrayList<IRealGun>();

	@Override
	public void addGun(IRealGun gunToAdd) throws ArtilleryUnitException {
		if (guns.contains(gunToAdd)) {
			throw new ArtilleryUnitException("Cannot add " + gunToAdd + 
					" to the unit, because it is already there.");
		}
		guns.add(gunToAdd);
	}

	@Override
	public int numberOfGuns() {
		return guns.size();
	}

	@Override
	public IRealArtilleryUnit gunsWithinRange(Coordinate toShootAt) {
		IRealArtilleryUnit gunsWithinRange = new ArrayListRealArtilleryUnit();
		double distance;
		for (IRealGun actualGun : guns) {
			distance = EuclidesMetric.distance(actualGun.getPosition(), toShootAt);
			if (distance <= actualGun.getRange()) {
				try {
					gunsWithinRange.addGun(actualGun);
				} catch (ArtilleryUnitException e) {
					// This cannot happen! Hopefully!
				}
			}
		}
		return gunsWithinRange;
	}

	public ArrayList<IRealGun> getGuns() {
		return guns;
	}

	public void setGuns(ArrayList<IRealGun> guns) {
		this.guns = guns;
	}

	@Override
	public Object[] toArray() {
		return guns.toArray();
	}

}
