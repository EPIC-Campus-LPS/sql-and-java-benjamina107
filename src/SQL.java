import java.sql.*;
public class SQL {

    private Connection connection;

    public String getFromNumber(String set, int num, String column) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/pokemon_spotify";
        String username = "java";
        String password = "password";
        String query = "SELECT " + column + " FROM "+ set + " WHERE number = " + num + " ;";
        Statement stmt = DriverManager.getConnection(url, username, password).createStatement();
        ResultSet rs = stmt.executeQuery(query);
        String rsString = "";
        if (rs.next()) {
            rsString = rs.getString(column);
        }


        if (rs.next()) {
            while (rs.next()) {
                rsString += ", " + rs.getString(column);
            }
        }

        return rsString;

    }

    public void removeEntry(int num) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/pokemon_spotify";
        String username = "java";
        String password = "password";
        String query = "DELETE FROM pokedex WHERE number = " + num + ";";
        Statement stmt = DriverManager.getConnection(url, username, password).createStatement();
        ResultSet rs = stmt.executeQuery(query);
    }

    public void addEntry(int num) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/pokemon_spotify";
        String username = "java";
        String password = "password";
        String query = "DELETE FROM pokedex WHERE number = " + num + ";";
        Statement stmt = DriverManager.getConnection(url, username, password).createStatement();
        ResultSet rs = stmt.executeQuery(query);
    }


}
