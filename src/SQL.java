import java.sql.*;
public class SQL {

    private Connection connection;

    public void connect() {
        String url = "jdbc:mysql://localhost:3306/pokemon_spotify";
        String username = "java";
        String password = "password";

        System.out.println("Connecting database ...");

        try (Connection c = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
            connection = c;
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

    }

    public ResultSet getResults(String query) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/pokemon_spotify";
        String username = "java";
        String password = "password";

        try (Connection c = DriverManager.getConnection(url, username, password)) {
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            return rs;
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }


    }

}
