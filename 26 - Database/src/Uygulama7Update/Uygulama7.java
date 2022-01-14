package Uygulama7Update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Uygulama7 {

    static Connection connection = null;

    static PreparedStatement preparedStatement = null;

    public static void main(String[] args) {

        getConnection();

        ogrenciGuncelle(2,"furkan","coskun");

        closeConnection();
    }

    public static void ogrenciGuncelle(int ogrenciID, String adi, String soyadi){

        String query = "UPDATE ogrenci SET adi = ? , soyadi=? WHERE ogrenciID = ? ";

        try {
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1,adi);
            preparedStatement.setString(2,soyadi);
            preparedStatement.setInt(3,ogrenciID);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("hata3  : " + e);
        }
    }

    public static void getConnection(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","alperen123");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("hata : " + e);
        }

    }

    public static void closeConnection(){

        if(preparedStatement != null){
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                System.out.println("hata : " + e);
            }
        }

        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("hata : " + e);
            }
        }
    }
}
