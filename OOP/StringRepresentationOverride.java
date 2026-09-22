package OOP;

class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override 
    public String toString() {
        return "User[" + username + ", " + email + "]";
    }
}

public class StringRepresentationOverride {
    public static void main(String[] args) {
        User u = new User("neha_k", "neha@example.com"); 
        System.out.println(u);
    }
}
