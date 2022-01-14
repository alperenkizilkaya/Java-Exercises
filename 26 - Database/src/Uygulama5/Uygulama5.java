package Uygulama5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Uygulama5 {

    static Connection connection = null;

    static PreparedStatement preparedStatement = null;

    public static void main(String[] args) {

        getConnection();

        ogrenciEkle(2,"furkan","coskun",1995);

        ogrenciEkle(3,"timucin","yildirim",1998);

        closeConnection();
    }

    public static void ogrenciEkle(int ogrenciID, String adi, String soyadi, int dogumYili){

        String query = "INSERT INTO ogrenci(ogrenciID,adi,soyadi,dogumYili) VALUES (?,?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1,ogrenciID);
            preparedStatement.setString(2, adi);
            preparedStatement.setString(3,soyadi);
            preparedStatement.setInt(4,dogumYili);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.err.println("hata : " + e);
        }

    }

    public static void getConnection(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("mysql driver bulunamadı... hata : " + e);
            return; // if there is an error with connection, finish the program
        }

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","alperen123");
        } catch (SQLException e) {
            System.err.println("database bağlantı hatası... hata : " + e);

        }

    }

    public static void closeConnection(){

        if(preparedStatement != null){
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                System.err.println("preparedStatement kapanırken sorun oluştu... hata : " + e);
            }
        }

        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println("connection kapanırken sorun oluştu... hata : " + e);
            }
        }
    }
}
