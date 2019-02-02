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

            Class.forName(JDBC_DRIVER).newInstance();
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
//
//        String updt = "CREATE TABLE mate (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(30), area VARCHAR(30), perimeter VARCHAR(30), user VARCHAR(50));";
//        try {
//            st.executeUpdate(updt);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        String sql = "SHOW TABLES";
        try {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        String sql1 = "DESCRIBE mate";
        try {
            ResultSet rs = st.executeQuery(sql1);

            while (rs.next()) {
                System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3)
                        + " | " + rs.getString(4)+ " | " + rs.getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        String DROP_MATE = "DROP TABLE mate";
//        try {
//            st.executeUpdate(DROP_MATE);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }






        String sql2 = "SELECT * FROM mate";
        try {
            ResultSet rs = st.executeQuery(sql2);
            while (rs.next()) {
                System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3)
                        + " | " + rs.getString(4) + " | " + rs.getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


//        String sql5 = "SELECT COUNT (id) AS total FROM mate WHERE id = 1";
//        try {
//            ResultSet rs = st.executeQuery(sql5);
//            rs.next();
//            int rows = rs.getInt("total");
//            System.out.println(rows);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }








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
