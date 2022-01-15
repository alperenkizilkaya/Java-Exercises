package Uygulama9GeneralExample;

public class Student {

    private int studentId;

    private String name;

    private String surname;

    private int birthYear;

    private String schoolNumber;

    public Student(){

    }

    public Student(int studentId, String name, String surname, int birthYear, String schoolNumber){
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.schoolNumber = schoolNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                ", schoolNumber='" + schoolNumber + '\'' +
                '}';
    }
}
