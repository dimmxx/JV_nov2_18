package homework.homework16;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DbWorkerItea2 {


    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://s3.thehost.ua/itea2";

    static final String USER = "helen";
    static final String PASS = "123456";

    private Connection conn;
    private Statement st;

    private final static String ADD_SHAPE = "INSERT INTO mate (name, area, perimeter, user) VALUES (?, ?, ?, ?)";
    private final static String GET_SHAPE_ALL = "SELECT * FROM mate";

    public DbWorkerItea2() {
        try {
            Class.forName(JDBC_DRIVER).newInstance();
        } catch (Exception ex) {
            System.out.println("Connection error...");
        }

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        try {
            st = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            st.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public boolean addShape(ShapeClass shape) {
        try {
            PreparedStatement prs = conn.prepareStatement(ADD_SHAPE);
            prs.setString(1, shape.getName());
            prs.setString(2, String.valueOf(shape.getArea()));
            prs.setString(3, String.valueOf(shape.getPerimeter()));
            prs.setString(4, shape.getUser());
            prs.executeUpdate();
            prs.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }


    public ShapeClass getShape(int id) {
        ShapeClass shape = null;
        String query = GET_SHAPE_ALL;
        try {
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                shape = new ShapeClass();
                shape.setId(Integer.parseInt(rs.getString(1)));
                shape.setName(rs.getString(2));
                shape.setArea(Double.parseDouble(rs.getString(3)));
                shape.setPerimeter(Double.parseDouble(rs.getString(4)));
                shape.setUser(rs.getString(5));

                return shape;
            }
        } catch (SQLException e) {
            System.out.println("SQL exception " + e.getMessage());
        }
        return null;
    }


}