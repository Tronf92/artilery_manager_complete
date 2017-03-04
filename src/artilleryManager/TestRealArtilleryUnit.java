package artilleryManager;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRealArtilleryUnit {
	
	private Coordinate hotelMoskva = new Coordinate(49.221287, 17.661286);
	private RealGun firstGun = new RealGun(1, 5, 10, hotelMoskva);
	private RealGun secondGun = new RealGun(2, 5, 10, hotelMoskva);
	private RealGun thirdGun = new RealGun(3, 5, 10, hotelMoskva);

	@Test
	public void test() throws ArtilleryUnitException {
		HashMapRealArtilleryUnit firstTestUnit = new HashMapRealArtilleryUnit();
		firstTestUnit.addGun(firstGun);
		firstTestUnit.addGun(secondGun);
		firstTestUnit.addGun(thirdGun);
		
		
		ArrayListRealArtilleryUnit secondTestUnit = new ArrayListRealArtilleryUnit();
		secondTestUnit.addGun(thirdGun);
		secondTestUnit.addGun(secondGun);
		secondTestUnit.addGun(firstGun);
		
		assertEquals(firstTestUnit, secondTestUnit);
	}

}
