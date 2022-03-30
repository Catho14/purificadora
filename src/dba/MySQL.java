package dba;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class MySQL {
    private static String db = "purificadora";
    private static String user = "root";
    private static String pass = "";
    private static String url = "jdbc:mysql://localhost/" + db;
    private static Connection Conn;
    public static Connection getConnetion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conn = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
        return Conn;
    }
}