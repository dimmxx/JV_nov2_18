package lesson.lesson16_26012019_jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DBWorker {


    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/ALKO";

    static final String USER = "root";
    static final String PASS = "root";

    private Connection conn;
    private Statement st;
    private final static String ADD_MATE = "INSERT INTO mate (name, age) VALUES";
    private final static String GET_MATE = "SELECT * FROM mate WHERE id = ";
    private final static String GET_MATE_ALL = "SELECT * FROM mate";

    public DBWorker() {
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

    public boolean addMate(Mate mate) {

        String sql = ADD_MATE + "('" + mate.getName() + "'," + mate.getAge() + ")";

        try {
            st.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public Mate getMate(int id) {
        Mate mate = new Mate();
        String query = GET_MATE + id;
        try {
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                mate.setId(Integer.parseInt(rs.getString(1)));
                mate.setName(rs.getString(2));
                mate.setAge(Integer.parseInt(rs.getString(3)));
                return mate;
            }
        } catch (SQLException e) {
            System.out.println("SQL exception " + e.getMessage());
        }
        return null;
    }

    public Mate getMateX(int id) {
        Mate mate = null;
        String query = GET_MATE + id;
        try {
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                mate = new Mate();
                mate.setId(Integer.parseInt(rs.getString(1)));
                mate.setName(rs.getString(2));
                mate.setAge(Integer.parseInt(rs.getString(3)));
                return mate;
            }
        } catch (SQLException e) {
            System.out.println("SQL exception " + e.getMessage());
        }
        return mate;
    }

    public ArrayList getMateAll() {
        ArrayList list = new ArrayList();
        String query = GET_MATE_ALL;
        try {
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Mate mate = new Mate();
                mate.setId(Integer.parseInt(rs.getString(1)));
                mate.setName(rs.getString(2));
                mate.setAge(Integer.parseInt(rs.getString(3)));
                list.add(mate);

            }
        } catch (SQLException e) {
            System.out.println("SQL exception " + e.getMessage());
        }
        return list;
    }

    public List<Mate> getMateAllX() {
        List<Mate> list = new ArrayList<>();
        String query = GET_MATE_ALL;
        try {
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Mate mate = new Mate();
                mate.setId(Integer.parseInt(rs.getString(1)));
                mate.setName(rs.getString(2));
                mate.setAge(Integer.parseInt(rs.getString(3)));
                list.add(mate);
            }
        } catch (SQLException e) {
            System.out.println("SQL exception " + e.getMessage());
        }
        return list;
    }

    public Set<Mate> getMateSetAllDistinct() {
        Set<Mate> listSet = new HashSet<>();
        String query = GET_MATE_ALL;
        try {
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Mate mate = new Mate();
                mate.setId(Integer.parseInt(rs.getString(1)));
                mate.setName(rs.getString(2));
                mate.setAge(Integer.parseInt(rs.getString(3)));
                listSet.add(mate);
            }
        } catch (SQLException e) {
            System.out.println("SQL exception " + e.getMessage());
        }
        return listSet;
    }


//    public Set<Mate> getMateSetAllX() {
//        Set<Mate> listSet = new HashSet<>() {
//            @Override
//            public boolean contains(Object o) {
//                return super.contains(o);
//            }
//
//            @Override
//            public boolean equals(Object o) {
//                return super.equals(o);
//            }
//
//            @Override
//            public int hashCode() {
//                return super.hashCode();
//            }
//        };
//        String query = GET_MATE_ALL;
//        try {
//            ResultSet rs = st.executeQuery(query);
//            while (rs.next()) {
//                Mate mate = new Mate();
//                mate.setId(Integer.parseInt(rs.getString(1)));
//                mate.setName(rs.getString(2));
//                mate.setAge(Integer.parseInt(rs.getString(3)));
//                list.add(mate);
//            }
//        } catch (SQLException e) {
//            System.out.println("SQL exception " + e.getMessage());
//        }
//        return list;
//
//
//    }
//
//    override equals
//    hashcode


}
