package Uygulama3PreparedStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Test {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("mysql driver bulunamadı : " + e);
            return;
        }

        Connection connection = null; //kod devamında kullanabilmek için try dışında tanımladık..
        PreparedStatement preparedStatement = null;

        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "alperen123");

            System.out.println("başarılı şekilde db bağlantısı sağlandı..");

            String query = "CREATE TABLE Ogrenci (" +
                    "           ogrenciID INT NOT NULL," +
                    "           adi VARCHAR(20) NOT NULL," +
                    "           soyadi VARCHAR(20) NOT NULL," +
                    "           dogumYili INT NOT NULL," +
                    "       PRIMARY KEY (ogrenciID));";

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.execute();

        } catch (Exception e) {
            System.err.println("hata : " + e);
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    System.err.println("statement kapanırken hataaa ");
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("connection kapanırken hataaa ");
                }
            }
        }


    }
}
