package Uygulama9GeneralExample;

public class Test {

    public static void main(String[] args) {

        DatabaseOperations databaseOperations = new DatabaseOperationsImpl();

        Student student1 = new Student(1,"alp","kizilkaya",1996,"112233");
        Student student2 = new Student(2,"timucin","yildirim",1990,"232233");
        Student student3 = new Student(3,"furkan","coskun",1985,"332255");

        databaseOperations.addStudent(student1);
        databaseOperations.addStudent(student2);
        databaseOperations.addStudent(student3);
        System.out.println("ogrenciler eklendi");

        System.out.println("delete - studentId = 2 : "); //timucin yildirim will delete
        databaseOperations.deleteStudent(2);

        System.out.println("search for studentId = 1 : ");
        databaseOperations.searchStudent(1);

        System.out.println("update student3 with new infos"); // furkan -> tiyu    coskun -> yildirim ...etc
        databaseOperations.updateStudent(student3,"tiyu","yildirim", 1996,"995588");

        System.out.println("all students : ");
        databaseOperations.showStudents();

    }
}
