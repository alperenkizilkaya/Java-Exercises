package Uygulama9GeneralExample;

import java.sql.*;

public class ConnectionOperations {

    public Connection getConnection(){

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("mysql driver bulundu..");
        } catch (ClassNotFoundException e) {
            System.out.println("hata1 : " + e);

            return null;  //if there is an error here, finish the code
        }

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","alperen123");
            System.out.println("bağlantı açıldı..");
        } catch (SQLException e) {
            System.out.println("hata2 : " + e);
            return null; //if there is an error here, finish the code
        }

        return connection;
    }

    public void closeConnections(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){

        if(resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                System.out.println("hata3 : " + e);
            }
        }
        if(preparedStatement != null){
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                System.out.println("hata4 : " + e);
            }
        }
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("hata5 : " + e);
            }
        }
    }
}
