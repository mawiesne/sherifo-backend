package shareifo;

public class User {

	private long id;
	private String username;
	private String password;
	private boolean isActive;
	
	
	
	public User(long id, String username, String password, boolean isActive) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.isActive = isActive;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
}
