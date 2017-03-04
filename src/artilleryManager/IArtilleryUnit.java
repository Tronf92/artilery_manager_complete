package artilleryManager;

public interface IArtilleryUnit {
	void addGun(IGun gunToAdd);

	int numberOfGuns();

	IArtilleryUnit gunsWithinRange(Coordinate toShootAt);
}
