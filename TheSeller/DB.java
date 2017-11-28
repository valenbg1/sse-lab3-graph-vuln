package TheSeller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class DB {
    private Connection con;

    public DB() {
        loadDriver();
    }

    private void loadDriver() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al crear el puente JDBC-ODBC");
        }
    }

    public Connection conectar() {
        String dbURL = "";
        String dataSourceName = "";
        try {
            dataSourceName = "C:\\TheSellerSoftware\\DB\\DB.mdb";

            dbURL = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ="
                    + dataSourceName;
            this.con = DriverManager.getConnection(dbURL, "", "");
        } catch (SQLException ex) {
            System.err.print("-------" + System.getProperty("user.dir"));
            return null;
        }
        return this.con;
    }

    public boolean closeConecction() {
        try {
            this.con.close();
        } catch (SQLException sqle) {
            return false;
        }
        return true;
    }

    public int[] login(String name) {
        ResultSet rs = null;

        conectar();
        int[] results = new int[2];
        results[0] = -1;
        results[1] = -1;
        try {
            Statement stm = this.con.createStatement();

            String id = "";
            if (name.equals("Jhon")) {
                id = "1";
            } else if (name.equals("Cris")) {
                id = "2";
            } else if (name.equals("Caroline")) {
                id = "3";
            } else if (name.equals("SalesAdmin")) {
                id = "4";
            }
            String strSQL = "SELECT Pass,IDUser FROM Users WHERE Id=" + id
                    + ";";

            rs = stm.executeQuery(strSQL);
            rs.next();
            results[0] = Integer.parseInt(rs.getString("Pass"));
            String userID = rs.getString("IDUser");
            if (userID.equals("SalesAdmin")) {
                results[1] = 1;
            }
            rs.close();
            stm.close();
        } catch (SQLException e) {
        }
        boolean isClosed = closeConecction();
        if (!isClosed) {
            System.out.println("Error al cerrar la conexion");
        }
        return results;
    }

    public void updatePlus(String name, int newSales) {
        ResultSet rs = null;

        conectar();
        int sales = 0;
        int plus = 0;
        String id = "";
        try {
            Statement stm = this.con.createStatement();
            if (name.equals("Jhon")) {
                id = "1";
            } else if (name.equals("Cris")) {
                id = "2";
            } else if (name.equals("Caroline")) {
                id = "3";
            }
            String strSQL = "SELECT Sales_euros_year, Plus_euros_year from Sales WHERE Id="
                    + id + ";";
            rs = stm.executeQuery(strSQL);
            rs.next();
            sales = Integer.parseInt(rs.getString("Sales_euros_year"));
            plus = Integer.parseInt(rs.getString("Plus_euros_year"));
            sales += newSales;
            plus += newSales;
            rs.close();
            stm.close();
        } catch (SQLException e) {
        }
        finalUpdate(sales, plus, id);
        boolean isClosed = closeConecction();
        if (!isClosed) {
            System.out.println("Error al cerrar la conexion");
        }
    }

    public void finalUpdate(int sales, int plus, String id) {
        conectar();
        try {
            Statement stm = this.con.createStatement();
            String strSQL;
            // String strSQL;
            if (sales > 0) {
                strSQL = "UPDATE Sales SET Sales_euros_year=" + sales
                        + ", Plus_euros_year=" + plus + " WHERE Id=" + id + ";";
            } else {
                strSQL = "UPDATE Sales SET Plus_euros_year=" + plus
                        + " WHERE Id=" + id + ";";
            }
            stm.executeUpdate(strSQL);
            stm.close();
        } catch (SQLException e) {
        }
        boolean isClosed = closeConecction();
        if (!isClosed) {
            System.out.println("Error al cerrar la conexion");
        }
    }

    public LinkedList<LinkedList<String>> selectAll() {
        ResultSet rs = null;

        conectar();
        LinkedList<LinkedList<String>> allSales = new LinkedList<LinkedList<String>>();
        try {
            Statement stm = this.con.createStatement();

            String strSQL = "SELECT Name, Profile, Sales_euros_year, Plus_euros_year, Surname FROM Sales;";
            rs = stm.executeQuery(strSQL);
            while (rs.next()) {
                LinkedList<String> list = new LinkedList<String>();

                list.add(rs.getString("Name"));
                list.add(rs.getString("Surname"));
                list.add(rs.getString("Profile"));
                list.add(rs.getString("Sales_euros_year"));
                list.add(rs.getString("Plus_euros_year"));
                allSales.add(list);
            }
            rs.close();
            stm.close();
        } catch (SQLException e) {
        }
        boolean isClosed = closeConecction();
        if (!isClosed) {
            System.out.println("Error al cerrar la conexion");
        }
        return allSales;
    }
}