package artilleryManager;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapRealArtilleryUnit extends RealArtilleryUnit {

	private HashMap<Integer, IRealGun> guns = new HashMap<Integer, IRealGun>();

	@Override
	public void addGun(IRealGun gunToAdd) throws ArtilleryUnitException {
		if (guns.containsKey(gunToAdd.getId())) {
			throw new ArtilleryUnitException("Gun: " + gunToAdd + " is already added!");
		}
		guns.put(new Integer(gunToAdd.getId()), gunToAdd);
	}

	@Override
	public int numberOfGuns() {
		return guns.size();
	}

	@Override
	public IRealArtilleryUnit gunsWithinRange(Coordinate toShootAt) {
		IRealArtilleryUnit gunsWithinRange = new HashMapRealArtilleryUnit();
		double distance;
		for (IRealGun actualGun : guns.values()) {
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

	@Override
	public int hashCode() {
		
		return toString().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof IRealArtilleryUnit))
			return false;
		IRealArtilleryUnit other = (IRealArtilleryUnit) obj;
		Object[] first = toArray();
		Object[] second = other.toArray();

		Arrays.sort(first);
		Arrays.sort(second);
		
		if (Arrays.deepEquals(first, second)){
			return true;
		}
		else{
			return false;
		}
	}
	
	@Override
	public Object[] toArray() {
		return guns.values().toArray();
	}

	@Override
	public String toString() {
		return Arrays.deepToString(toArray());
	}

}
