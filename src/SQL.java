import java.sql.*;

/**
 * A class made for interacting with SQL database.
 */
public class SQL {

    /**
     * Uses 'select' to get a specific item from a specific column / number
     *
     * @param set The specific table being grabbed from
     * @param num The specific index number for foreign key
     * @param column The specific column to get th evalue from
     * @return The value in the spot cast to a string
     * @throws SQLException
     */
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

    /**
     * Removes a row from all 3 tables with corresponding number
     *
     * @param num The number index for foreign/primary key
     * @throws SQLException
     */
    public void removeEntry(int num) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/pokemon_spotify";
        String username = "java";
        String password = "password";


        String query = "DELETE FROM pokedex WHERE number = " + num + ";";
        String query3 = "DELETE FROM topcompanies WHERE number = " + num + ";";
        String query2 = "DELETE FROM spotify WHERE number = " + num + ";";




        Connection con = null;
        PreparedStatement p = null;
        Connection con2 = null;
        PreparedStatement p2 = null;
        Connection con3 = null;
        PreparedStatement p3 = null;


        con = DriverManager.getConnection(url, username, password);
        p = con.prepareStatement(query);
        p.execute();


        con2 = DriverManager.getConnection(url, username, password);
        p2 = con2.prepareStatement(query2);
        p2.execute();


        con3 = DriverManager.getConnection(url, username, password);
        p3 = con3.prepareStatement(query3);
        p3.execute();
    }

    /**
     * Adds identical rows to all 3 tables with a specific number and name
     *
     * @param num The number being added
     * @param nm The name being added
     * @throws SQLException
     */
    public void addEntry(int num, String nm) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/pokemon_spotify";
        String username = "java";
        String password = "password";
        String query = "INSERT INTO topcompanies (number, name) VALUES (\"" + num + "\", \"" + nm + "\") ;";
        String query2 = "INSERT INTO spotify (number, name) VALUES (\"" + num + "\", \"" + nm + "\") ;";
        String query3 = "INSERT INTO pokedex (number, name) VALUES (\"" + num + "\", \"" + nm + "\") ;";


        Connection con = null;
        PreparedStatement p = null;
        Connection con2 = null;
        PreparedStatement p2 = null;
        Connection con3 = null;
        PreparedStatement p3 = null;


        con = DriverManager.getConnection(url, username, password);
        p = con.prepareStatement(query);
        p.execute();


        con2 = DriverManager.getConnection(url, username, password);
        p2 = con2.prepareStatement(query2);
        p2.execute();


        con3 = DriverManager.getConnection(url, username, password);
        p3 = con3.prepareStatement(query3);
        p3.execute();
    }

    /**
     * Updates identical rows to all 3 tables with a specific number and name
     *
     * @param num The number being updated
     * @param name The name being updated
     * @throws SQLException
     */
    public void updateEntry(int num, String name) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/pokemon_spotify";
        String username = "java";
        String password = "password";
        String query = "UPDATE topcompanies SET name = \"" + name + "\" WHERE number = " + num + ";";
        String query2 = "UPDATE spotify SET name = \"" + name + "\" WHERE number = " + num + ";";
        String query3 = "UPDATE pokedex SET name = \"" + name + "\" WHERE number = " + num + ";";


        Connection con = null;
        PreparedStatement p = null;
        Connection con2 = null;
        PreparedStatement p2 = null;
        Connection con3 = null;
        PreparedStatement p3 = null;


        con = DriverManager.getConnection(url, username, password);
        p = con.prepareStatement(query);
        p.execute();


        con2 = DriverManager.getConnection(url, username, password);
        p2 = con2.prepareStatement(query2);
        p2.execute();


        con3 = DriverManager.getConnection(url, username, password);
        p3 = con3.prepareStatement(query3);
        p3.execute();
    }


}

