import java.sql.SQLException;
import java.sql.*;
public class Main {

    public static void main(String[] args) throws SQLException {

        SQL sql = new SQL();
        sql.connect();

        ResultSet rs = sql.getResults("SELECT name FROM pokedex WHERE pokedex_number = 128 ;" );

        while(rs.next()) {
            System.out.print(rs.getString("name"));
        }


    }
}
