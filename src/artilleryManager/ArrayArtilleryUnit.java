package artilleryManager;

@Deprecated
public class ArrayArtilleryUnit implements IArtilleryUnit {

	private IGun[] guns = new IGun[100];
	private int numberOfGuns = 0;

	@Override
	public void addGun(IGun gunToAdd) {
		guns[numberOfGuns++] = gunToAdd;
	}

	@Override
	public int numberOfGuns() {
		return numberOfGuns;
	}

	@Override
	public IArtilleryUnit gunsWithinRange(Coordinate toShootAt) {
		ArrayArtilleryUnit withinRange = new ArrayArtilleryUnit();
		double distance;
		IGun actualGun;
		for (int i = 0; i < numberOfGuns; i++) {
			actualGun = guns[i];
			distance = EuclidesMetric.distance(actualGun.getPosition(), toShootAt);
			if (distance <= actualGun.getRange()) {
				withinRange.addGun(actualGun);
			}
		}
		return withinRange;
	}

	@Override
	public String toString() {
		String list = "";
		for (int i = 0; i < numberOfGuns; i++) {
			list += guns[i].toString() + System.lineSeparator();
		}
		return list;
	}

}
