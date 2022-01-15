package Uygulama9GeneralExample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseOperationsImpl implements  DatabaseOperations{

    private ConnectionOperations connection = new ConnectionOperations();


    @Override
    public void addStudent(Student student) {

        String query = "INSERT INTO student(studentId, name, surname, birthYear, schoolNumber) VALUES (?,?,?,?,?)";

        Connection conn = connection.getConnection();

        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = conn.prepareStatement(query);

            preparedStatement.setInt(1,student.getStudentId());
            preparedStatement.setString(2,student.getName());
            preparedStatement.setString(3,student.getSurname());
            preparedStatement.setInt(4,student.getBirthYear());
            preparedStatement.setString(5,student.getSchoolNumber());

            preparedStatement.executeUpdate();

            connection.closeConnections(conn,preparedStatement,null);

        } catch (SQLException e) {
            System.out.println("hata6 : " + e);
        }

    }

    @Override
    public void deleteStudent(int studentId) {

        String query = "DELETE FROM student WHERE studentId = ?";

        Connection conn = connection.getConnection();

        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = conn.prepareStatement(query);

            preparedStatement.setInt(1,studentId);

            preparedStatement.executeUpdate();

            connection.closeConnections(conn, preparedStatement,null);

        } catch (SQLException e) {
            System.out.println("hata7 : " + e);
        }

    }

    @Override
    public void updateStudent(Student student, String newName, String newSurname, int newBirthYear, String newSchoolNumber) {

        String query = "UPDATE student SET name = ?, surname = ?, birthYear = ?, schoolNumber = ? WHERE studentId = ?";

        Connection conn = connection.getConnection();

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            preparedStatement.setString(1,newName);
            preparedStatement.setString(2,newSurname);
            preparedStatement.setInt(3,newBirthYear);
            preparedStatement.setString(4,newSchoolNumber);
            preparedStatement.setInt(5,student.getStudentId());

            preparedStatement.executeUpdate();

            connection.closeConnections(conn,preparedStatement,null);

        } catch (SQLException e) {
            System.out.println("hata8 : " + e);
        }
    }

    @Override
    public void showStudents() {

        String query = "SELECT * FROM student";

        Connection conn = connection.getConnection();

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){

                int studentId = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String surname = resultSet.getString(3);
                int birthYear = resultSet.getInt(4);
                String schoolNumber = resultSet.getString(5);

                System.out.println(studentId + " " + name + " " + surname + " " + birthYear + " " + schoolNumber);
            }

            connection.closeConnections(conn,preparedStatement, resultSet);

        } catch (SQLException e) {
            System.out.println("hata8 : " + e);
        }
    }

    @Override
    public void searchStudent(int studentId) {
        String query = "SELECT * FROM student WHERE studentId = ?";

        Connection conn = connection.getConnection();

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            preparedStatement.setInt(1,studentId);

            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();

            String id = resultSet.getString("studentId");
            String name = resultSet.getString("name");
            String surname = resultSet.getString("surname");
            String birthYear = resultSet.getString("birthYear");
            String schoolNumber = resultSet.getString("schoolNumber");

            System.out.println(id + " " + name + " " + surname + " " + birthYear + " " + schoolNumber);

            connection.closeConnections(conn,preparedStatement, resultSet);

        } catch (SQLException e) {
            System.out.println("hata8 : " + e);
        }
    }
}
