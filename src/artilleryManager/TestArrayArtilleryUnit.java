package artilleryManager;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrayArtilleryUnit {

	private Coordinate parkingLotZlin = new Coordinate(49, 13, 51.2, 17, 39, 26.9);
	private Coordinate hotelMoskva = new Coordinate(49.221287, 17.661286);
	private Coordinate secretHouse = new Coordinate(49.060457, 17.484250);
	private Gun testGun = new Gun(5, 10, parkingLotZlin){};

	@Test
	public void testNumberOfGuns() {
		ArrayArtilleryUnit testList = new ArrayArtilleryUnit();
		testList.addGun(testGun);
		assertEquals(1, testList.numberOfGuns());
	}

	@Test
	public void testGunsWithinRange() {
		ArrayArtilleryUnit testList = new ArrayArtilleryUnit();
		testList.addGun(testGun);
		ArrayArtilleryUnit gunsWithinRange = (ArrayArtilleryUnit) testList.gunsWithinRange(hotelMoskva);
		assertEquals(1, gunsWithinRange.numberOfGuns());
	}

	@Test
	public void testGunsWithinRangeNot() {
		ArrayArtilleryUnit testList = new ArrayArtilleryUnit();
		testList.addGun(testGun);
		ArrayArtilleryUnit gunsWithinRange = (ArrayArtilleryUnit) testList.gunsWithinRange(secretHouse);
		assertEquals(0, gunsWithinRange.numberOfGuns());
	}
	
}
