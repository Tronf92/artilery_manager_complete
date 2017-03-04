package artilleryManager;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRealGun {

	private Coordinate hotelMoskva = new Coordinate(49.221287, 17.661286);
	private RealGun firstGun = new RealGun(1, 5, 10, hotelMoskva);
	private RealGun alsoFirstGun = new RealGun(1, 5, 10, hotelMoskva);
	private RealGun secondGun = new RealGun(2, 5, 10, hotelMoskva);

	@Test
	public void testEqualsObject() {
		assertEquals(firstGun, alsoFirstGun);
	}
	
	@Test
	public void testNotEqualsObject() {
		System.out.println(firstGun.hashCode());
		System.out.println(secondGun.hashCode());
		assertNotEquals(firstGun, secondGun);
	}

}
