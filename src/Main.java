import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {

        SQL sql = new SQL();

        int num = (int) (889 * Math.random() + 1);

        System.out.print(sql.getFromNumber("pokedex", num, "name"));
        System.out.print(", the ");
        System.out.println(sql.getFromNumber("pokedex", num, "species"));

        System.out.println("corresponds to the song");

        System.out.print(sql.getFromNumber("spotify", num, "name"));
        System.out.print(", by ");
        System.out.println(sql.getFromNumber("spotify", num, "Artist"));

        System.out.println("and the company ");

        System.out.print(sql.getFromNumber("topcompanies", num, "name"));
        System.out.print(", from ");
        System.out.println(sql.getFromNumber("topcompanies", num, "Country"));

        System.out.println();

        sql.addEntry(99999, "doody");

        System.out.println("added item");

        System.out.print(sql.getFromNumber("topcompanies", 99999, "name"));

        sql.removeEntry(99999);

        System.out.print(", removed item");

        sql.addEntry(99999, "doody");
        sql.updateEntry(99999, "Skibodi touelet");

        System.out.print(", updated to ");

        System.out.print(sql.getFromNumber("topcompanies", 99999, "name"));
    }
}
