package lesson.lesson15_23012019_jdbc;

import java.sql.*;

public class Test1 {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://s3.thehost.ua/itea2";

    static final String USER = "helen";
    static final String PASS = "123456";

    public static void main(String[] args) {

        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        }

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

       System.out.println("Connection OK...");

        Statement st = null;
        try {
            st = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql = "SHOW TABLES";
        try {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql1 = "DESCRIBE users";
        try {
            ResultSet rs = st.executeQuery(sql1);

            while (rs.next()) {
                System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3)
                        + " | " + rs.getString(4) + " | " + rs.getString(5) +
                        " | " + rs.getString(6));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql2 = "SELECT * FROM users";
        try {
            ResultSet rs = st.executeQuery(sql2);
            while (rs.next()) {
                System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3)
                        + " | " + rs.getString(4) + " | " + rs.getString(5) +
                        " | " + rs.getString(6) + " | " + rs.getString(7));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql3 = "SELECT * FROM users";
        try {
            ResultSet rs = st.executeQuery(sql3);
            while (rs.next()) {
                System.out.println(rs.getString("id") + " | " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        String updt = "INSERT INTO users (login, name, password, area, gender, comment) VALUES ('dimmxx@gmail.com', 'Borysov Dmytro', '0672998553', 'Kyiv', 'MALE', 'MateAcademy')";
//        try {
//            st.executeUpdate(updt);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        try {
            st.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
