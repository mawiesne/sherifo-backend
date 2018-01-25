package shareifo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUser {

	@Test
	public void testUser() {
		User testUser = new User(1, "junitUser", "junitPass", true);
		assertEquals("junitUser", testUser.getUsername());
	}

	

}
