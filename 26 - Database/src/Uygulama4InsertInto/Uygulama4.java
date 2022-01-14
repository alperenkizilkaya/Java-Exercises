package Uygulama4InsertInto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Uygulama4 {

    static Connection connection = null;

    static PreparedStatement preparedStatement = null;

    public static void main(String[] args) {

        getConnection();

        String sql = "INSERT INTO ogrenci(ogrenciID,adi,soyadi,dogumYili) VALUES (?,?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1,1);
            preparedStatement.setString(2,"akin");
            preparedStatement.setString(3,"kursat");
            preparedStatement.setInt(4,1985);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("preparedStatement işlemlerinde hata : " + e);;
        }

        closeConnection();
    }

    public static void getConnection(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("mysql driver bulunamadı...hata : " + e);
        }

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","alperen123");
        } catch (SQLException e) {
            System.err.println("bağlanti oluşurken sorun var....hata : "+ e);
        }

    }

    public static void closeConnection(){

        if(preparedStatement != null){
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                System.err.println("preparedStatement kapanırken sorun var.... hata : " + e);
            }
        }
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println("bağlantı kapanırken sorun var.... hata : " + e);
            }
        }
    }
}
