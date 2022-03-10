package time;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void testGetTotalSecondsGood() {
		int seconds = Time.getTotalSeconds("05:05:05");
		assertTrue("The seconds were not calculated properly", seconds == 18305);
	}

	@Test
	public void testGetTotalSecondsBad() {
		assertThrows(StringIndexOutOfBoundsException.class, () -> {
			Time.getTotalSeconds("10:00");
		});
	}

	@Test
	void testGetTotalSecondsBoundary() {
		assertThrows(NumberFormatException.class, () -> {
			Time.getTotalSeconds("-24:60:60");
		});
	}

	@Test
	void testGetSecondsGood() {
		int seconds = Time.getSeconds("05:05:05");
		assertTrue("The seconds were not calculated properly", seconds == 05);
	}

	@Test
	void testGetSecondsBad() {
		assertThrows(StringIndexOutOfBoundsException.class, () -> {
			Time.getSeconds("10:00");
		});
	}

	@Test
	void testGetSecondsBoundary() {
		assertThrows(NumberFormatException.class, () -> {
			Time.getSeconds("-24:60:60");
		});
	}

	@Test
	void testGetTotalMinutesGood() {
		int minutes = Time.getTotalMinutes("13:36:15");
		assertTrue("The seconds were not calculated properly", minutes == 36);
	}
	@Test
	void testGetTotalMinutesBad() {
		assertThrows(StringIndexOutOfBoundsException.class, () -> {
			Time.getTotalMinutes("1");
		});
	}

	@Test
	void testGetTotalMinutesBoundary() {
		assertThrows(NumberFormatException.class, () -> {
			Time.getTotalMinutes("-24:60:60");
		});
	}

	@Test
	void testGetTotalHoursGood() {
		int hours = Time.getTotalHours("23:15:55");
		assertTrue("The seconds were not calculated properly", hours == 23);
	}
	@Test
	void testGetTotalHoursBad() {
		assertThrows(StringIndexOutOfBoundsException.class, () -> {
			Time.getTotalHours("5");
		});
	}

	@Test
	void testGetTotalHoursBoundary() {
		assertThrows(NumberFormatException.class, () -> {
			Time.getTotalHours("Ten Thirtheen Fifty Three");
		});
	}		
}
