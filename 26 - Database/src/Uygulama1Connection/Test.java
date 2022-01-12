package Uygulama1Connection;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("mysql driver bulunamadı : " + e);
            return;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        Connection connection = null; //kod devamında kullanabilmek için try dışında tanımladık..
        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root","alperen123");
            System.out.println("başarılı şekilde db bağlantısı sağlandı..");
        } catch (SQLException e) {
            System.err.println("mysql bağlanamadı : " + e);
        } finally{
            if(connection != null){
                try {
                    connection.close();
                    System.out.println("bağlantı kapandı");
                } catch (SQLException e) {
                    System.err.println("bağlantı kapatılırken hata oluştu : " + e);
                }
            }
        }
    }
}
