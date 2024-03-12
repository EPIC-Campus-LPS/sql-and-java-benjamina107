import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {

        SQL sql = new SQL();

        Scanner scanner = new Scanner(System.in);


        System.out.println();
        System.out.println("Input a number");
        System.out.println();

        String word = scanner.next();











        int num = (int) (889 * Math.random() + 1);

        System.out.print(sql.getFromNumber("pokedex", num, "name"));
        System.out.print(", the ");
        System.out.println(sql.getFromNumber("pokedex", num, "species"));

        System.out.print(sql.getFromNumber("spotify", num, "name"));
        System.out.print(", by ");
        System.out.println(sql.getFromNumber("spotify", num, "Artist"));

        System.out.print(sql.getFromNumber("topcompanies", num, "name"));
        System.out.print(", from ");
        System.out.println(sql.getFromNumber("topcompanies", num, "Country"));

    }
}
