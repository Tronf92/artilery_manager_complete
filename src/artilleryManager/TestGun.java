package artilleryManager;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGun {

	private Coordinate hotelMoskva = new Coordinate(49.221287, 17.661286);
	private Gun firstGun = new Gun(5, 10, hotelMoskva) {
	};
	private Gun secondGun = new Gun(5, 10, hotelMoskva) {
	};

	@Test
	public void testEquals() {
		assertEquals(firstGun, secondGun);
	}
}
