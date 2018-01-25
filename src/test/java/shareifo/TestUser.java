package shareifo;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import database.DataBaseConnector;

public class TestUser {

	@Ignore
	public void testUser() {
		User testUser = new User(1, "junitUser", "junitPass", true);
		assertEquals("junitUser", testUser.getUsername());
	}
	
	@Test
	public void setUser() {
		DataBaseConnector.setUser();
	}
	

}
