package DAL.entities;

import java.util.List;

public class User {
    private Long id;
    private String userName;
    private String pass;
    private List<Role> roles;

    public Long getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }
    public String getPass() {
        return pass;
    }
    public List<Role> getRoles() {
        return roles;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
