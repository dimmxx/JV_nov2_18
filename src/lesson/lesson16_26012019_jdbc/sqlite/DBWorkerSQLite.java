package lesson.lesson16_26012019_jdbc.sqlite;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DBWorkerSQLite {

    private final static String ADD_MATE = "INSERT INTO mate (name, age) VALUES";
    private final static String GET_MATE = "SELECT * FROM mate WHERE id = ";
    private final static String GET_MATE_ALL = "SELECT * FROM mate";
    Connection conn = null;
    Statement st = null;

    public DBWorkerSQLite() {

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            // create a database connection
            conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
            st = conn.createStatement();
            st.setQueryTimeout(30);  // set timeout to 30 sec.
            System.out.println("Connection OK");

        } catch (SQLException e) {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println(e.getMessage());
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

    public void createTable() {
        try {
            st.executeUpdate("CREATE TABLE mate (ID INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR, age INT)");
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
            return null;
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
}
