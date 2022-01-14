package Uygulama8Select;

import java.sql.*;

public class Uygulama8 {

    static Connection connection = null;

    static PreparedStatement preparedStatement = null;

    static ResultSet resultSet = null;

    public static void main(String[] args) {

        getConnection();

        ogrenciGoster();

        closeConnection();
    }

    public static void ogrenciGoster(){

        String sql = "SELECT * FROM ogrenci";

        try {
            preparedStatement = connection.prepareStatement(sql);

            resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){

                String ogrenciID = resultSet.getString("ogrenciID");
                String adi = resultSet.getString("adi");
                String soyadi = resultSet.getString("soyadi");
                String dogumYili = resultSet.getString("dogumYili");

                System.out.println(ogrenciID + " " + adi + " " + soyadi + " " + dogumYili);
            }

        } catch (SQLException e) {
            System.out.println("hata5 : " + e);
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
        if(resultSet != null){
            try {
                resultSet.close();
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
