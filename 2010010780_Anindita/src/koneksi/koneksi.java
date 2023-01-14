package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    
    private final String url = "jdbc:mysql://localhost:3306/penyewaan_pc";
    private final String user = "root";
    private final String pass = "";
    
    public Connection getKoneksi(){
        Connection conn;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("koneksi berhasil");
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("err : "+ex);
            return conn = null;
        }
    }
    
}
