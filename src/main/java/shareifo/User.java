package shareifo;

import javax.persistence.*;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private boolean isActive;

    public User() {
    }

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
