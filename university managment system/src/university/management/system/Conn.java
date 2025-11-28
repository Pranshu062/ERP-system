package university.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection connection;
    Statement statement;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //  🔥 FULLY FIXED CONNECTION URL
//            connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/universitymanagement?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
//                    "root",
//                    "jag@301006"
//            );
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/universitymanagment?useSSL=false&serverTimezone=UTC",
                    "root",
                    "jag@301006"
            );


            statement = connection.createStatement();
            System.out.println("✅ Database Connected Successfully!");

        } catch (Exception e) {
            System.out.println("❌ Database Connection Failed!");
            e.printStackTrace();
        }
    }
}
