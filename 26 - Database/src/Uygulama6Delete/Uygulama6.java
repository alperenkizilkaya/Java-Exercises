package Uygulama6Delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Uygulama6 {

    static Connection connection = null;

    static PreparedStatement preparedStatement = null;

    public static void main(String[] args) {

        getConnection();

        ogrenciSil(1);

        closeConnection();
    }

    public static void ogrenciSil(int ogrenciID){

        String query = "DELETE FROM ogrenci WHERE ogrenciID = ?";

        try {
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1,ogrenciID);

            preparedStatement.executeUpdate();

            System.out.println(ogrenciID + " numaralı ogrenciID'ye sahip öğrenci silindi");

        } catch (SQLException e) {
            System.out.println("hata : " + e);
        }

    }

    public static void getConnection(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("hata : " + e);
        }

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","alperen123");
        } catch (SQLException e) {
            System.out.println("hata : " + e);
        }


    }

    public static void closeConnection(){

        if(preparedStatement != null){
            try {
                preparedStatement.close();
                System.out.println("preparedstatement kapandı..");
            } catch (SQLException e) {
                System.out.println("hata : " + e);
            }
        }

        if(connection != null){
            try {
                connection.close();
                System.out.println("connection kapandı..");
            } catch (SQLException e) {
                System.out.println("hata : " + e);
            }
        }

    }
}
