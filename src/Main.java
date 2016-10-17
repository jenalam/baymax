import oracle.jdbc.driver.OracleDriver;

import java.sql.*;

/**
 * Created by Jennifer on 10/16/2016.
 */
public class Main {
    private static final String url = "jdbc:oracle:thin:@localhost:1522:ug";
    private static final String userId = "ora_n2x9a";
    private static final String password = "a32664138";

    public static void main(String[] args){
        try {
            DriverManager.registerDriver(new OracleDriver());

            //Create connection to database
            Connection con = DriverManager.getConnection(url, userId, password);

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM branch");
            rs.next();
            System.out.println(rs.getInt(1));

            //Close connection to database
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
