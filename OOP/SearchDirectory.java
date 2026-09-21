package OOP;

class UserDirectory {

    public void findUser(int id) {
        System.out.println("Searching by ID: " + id);
    }

    public void findUser(String name) {
        System.out.println("Searching by name: " + name);
    }
}

public class SearchDirectory {
    public static void main(String[] args) {
        UserDirectory dir = new UserDirectory(); 
        dir.findUser(101); 
        dir.findUser("neha_k");
    }
}
