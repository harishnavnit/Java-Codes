import java.sql.*;
import java.util.*;

public class selectOperation {
    public static void main(String args[]) {

        Connection c = null;
        Statement s  = null;

        try {
            // Register the driver
            Class.forName("org.postgresql.Driver");

            // Connect to the database
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dennis", "dennis", "******");
            System.out.println("\nOpened Database successfully\n");

            // Statement to be executed
            s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * from first_table");

            while(rs.next()) {
                int sNo             = rs.getInt("serialno");
                String columnValue  = rs.getString("columnValue");

                // Print the result
                System.out.println("Serial No : " + sNo);
                System.out.println("Column Value : " + columnValue);
            }
            // Close all connections
            rs.close();
            s.close();
            c.close();
        }
        catch (Exception e) {
            System.err.println(e.getClass().getName() + " : " + e.getMessage() );
            System.exit(0);
        }

        System.out.println("\nOperation done successfully\n");
    }
}
