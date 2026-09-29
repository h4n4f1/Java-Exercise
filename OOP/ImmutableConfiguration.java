package OOP;

class SystemConfig {
    final String DATABASE_URL = "jdbc:mysql://localhost:3306/app";

    final public void showVersion() {
        System.out.println("Version 1.0, DB: " + DATABASE_URL);
    }
}

//class Test extends SystemConfig {
//   public void showVersion() { }
//}

public class ImmutableConfiguration {
    public static void main(String[] args) {
        SystemConfig config = new SystemConfig(); 
        config.showVersion();
    }
}
