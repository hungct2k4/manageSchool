package LoginAndRegister;

public class Account {
    private String id;
    private String password;
    
    public Account(String id) {
        this.id = id;
        this.password = "123";
    }

    public Account() {
        
    }

    public Account(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
