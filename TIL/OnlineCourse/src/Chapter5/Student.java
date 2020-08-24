package Chapter5;

public class Student {

    int studentID;
    String studentName;
    String address;

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }

//    public static void main(String[] args) {
//
//        Student studentPark = new Student();
//        studentPark.studentName = "박은종";
//        studentPark.showStudentInfo();
//    }
}

class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student();
        studentLee.studentName = "이순신";
        studentLee.address = "서울";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentName = "김유신";
        studentKim.address = "경주";

        studentKim.showStudentInfo();

        System.out.println(studentLee);
        System.out.println(studentKim);
    }
}

