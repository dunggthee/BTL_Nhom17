
package b;

import java.sql.Connection;
import java.sql.DriverManager;

public class B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=benh;user=sa;password=213051");
             System.out.println("Kết nối thành công!");
         } catch (Exception e) {
            System.out.println("Kết nối thất bại!");
        }
        // TODO code application logic here
        login l=new login();
        l.setVisible(true);
    }
    
}
