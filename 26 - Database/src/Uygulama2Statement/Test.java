package Uygulama2Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("mysql driver bulunamadı : " + e);
            return;
        }

        Connection connection = null; //kod devamında kullanabilmek için try dışında tanımladık..
        Statement statement = null;

        try {

            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root","alperen123");

            System.out.println("başarılı şekilde db bağlantısı sağlandı..");

            statement = (Statement) connection.createStatement();

            String query = "CREATE TABLE Ogrenci (" +
                    "           ogrenciID INT NOT NULL," +
                    "           adi VARCHAR(20) NOT NULL," +
                    "           soyadi VARCHAR(20) NOT NULL," +
                    "           dogumYili INT NOT NULL," +
                    "       PRIMARY KEY (ogrenciID));";

            statement.execute(query);

        } catch (Exception e) {
            System.err.println("hata : " + e);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.err.println("statement kapanırken hataaa ");
                }
            }if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("connection kapanırken hataaa ");
                }
            }
        }


    }
}
