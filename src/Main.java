import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.connect()) {

            // WRITE
            conn.createStatement().executeUpdate(
                    "INSERT INTO Artist(name) VALUES ('Coldplay')");

            // READ
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM Artist");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

            // UPDATE
            conn.createStatement().executeUpdate(
                    "UPDATE Artist SET name='Coldplay Band' WHERE name='Coldplay'");

            // DELETE
            conn.createStatement().executeUpdate(
                    "DELETE FROM Artist WHERE name='Coldplay Band'");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}