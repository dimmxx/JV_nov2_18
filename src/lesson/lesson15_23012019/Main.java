package lesson.lesson15_23012019;

import java.sql.*;

public class Main {


    public static void main(String[] args) {

        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        }




        Connection conn = null;
        try {
            conn =
                    DriverManager.getConnection("jdbc:mysql://localhost/ALKO?" +
                            "user=root&password=");

            // Do something with the Connection


        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        System.out.println("Connection OK");

        Statement st = null;
        try {
            st = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql = "SELECT * FROM drinks";
        try {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getString(1) + rs.getString(2) + rs.getString(3) + rs.getString(4)+ rs.getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            st.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
