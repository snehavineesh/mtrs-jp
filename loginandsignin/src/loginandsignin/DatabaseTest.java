package loginandsignin;
public class DatabaseTest {

    public static void main(String[] args) {
        var connection = DatabaseConnection.getConnection();
        if (connection != null) {
            System.out.println("Connected to the database!");
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}