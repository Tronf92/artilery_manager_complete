package artilleryManager;

public interface IRealArtilleryUnit {

	void addGun(IRealGun gunToAdd) throws ArtilleryUnitException;

	int numberOfGuns();

	IRealArtilleryUnit gunsWithinRange(Coordinate toShootAt);
	
	Object[] toArray();
}