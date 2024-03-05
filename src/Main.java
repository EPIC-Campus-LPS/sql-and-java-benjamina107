import java.sql.SQLException;
import java.sql.*;
public class Main {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/pokemon_spotify";
        String username = "java";
        String password = "password";
        SQL sql = new SQL();
        sql.connect();

        int num = 25;

        Statement stmt = DriverManager.getConnection(url, username, password).createStatement();
        ResultSet rs = sql.getResults("SELECT name FROM pokedex WHERE pokedex_number = " + num + " ;", stmt );


        Statement stmt2 = DriverManager.getConnection(url, username, password).createStatement();
        ResultSet rs2 = sql.getResults("SELECT Title, Artist FROM spotify WHERE ranking = " + num + " ;",  stmt2 );


        while(rs.next()) {
            System.out.print(rs.getString("name") + ", ");
        }
        System.out.print(" matches with the song " );
        while(rs2.next()) {
            System.out.print(rs2.getString("Title"));
            System.out.print(" by ");
            System.out.println(rs2.getString("Artist"));
        }
    }
}
