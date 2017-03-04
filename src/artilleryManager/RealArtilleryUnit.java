package artilleryManager;

import java.util.Arrays;

public abstract class RealArtilleryUnit implements IRealArtilleryUnit{

	@Override
	abstract public void addGun(IRealGun gunToAdd) throws ArtilleryUnitException;
	

	@Override
	abstract public int numberOfGuns();

	@Override
	abstract public IRealArtilleryUnit gunsWithinRange(Coordinate toShootAt);

	@Override
	abstract public Object[] toArray();
	
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
	public String toString() {
		return Arrays.deepToString(toArray());
	}
}
