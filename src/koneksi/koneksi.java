package koneksi;

import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection conn;
    
    public static Connection Koneksi(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiketHadi", "root", "");
            return koneksi;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()); // Menggunakan JOptionPane yang benar dan menampilkan pesan kesalahan dari exception
            return null;
        }       
    }
}
