import java.sql.Connection;
import java.sql.DriverManager;

public class connectDB {
    public static void main(String args[]) {
        Connection c = null;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dennis", "dennis", "********");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + " : " + e.getMessage());
            System.exit(0);
        }

        System.out.println("\nOpened database successfully\n");
    }
}
