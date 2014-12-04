import java.sql.*;
import java.util.*;

public class insertIntoTable {
    public static void main(String args[]) {

        Connection c = null;
        Statement  s = null;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dennis", "dennis", "*****");
            System.out.println("\nOpened Database successfully\n");

            s = c.createStatement();

            String sql = "insert into first_table values(3, 'randomShitThree')";
            s.executeUpdate(sql);

            s.close();
            c.close();
        }
        catch(Exception e) {
            System.err.println(e.getClass().getName() + " : " + e.getMessage() );
            System.exit(0);
        }

        System.out.println("\nInsertion complete succesfully");
    }
}
