package Uygulama9GeneralExample;

public interface DatabaseOperations {

    public void addStudent(Student student);

    public void deleteStudent(int studentId);

    public void updateStudent(Student student, String newName, String newSurname, int newBirthYear, String newSchoolNumber);

    public void showStudents();

    public void searchStudent(int StudentId);
}
