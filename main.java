import src.Student;
import src.StudentList;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student SinhVien1 = new Student("MSV696969","Son Nguyen","1997-1-1", "cuoi Ha Noi","0159753852" );
        Student SinhVien2 = new Student("MSV686868","Duc Anh","2001-06-25", "dau Ha Noi","0963212083" );
        Student SinhVien3 = new Student("MSV686869","Duc Anh","2001-10-23", "dau Ha Noi","0963012398" );
//        System.out.println(SinhVien1.getInfo());
//        System.out.printf("Điểm trung bình: %.2f",SinhVien1.getPointAverage(8,7,5));
        StudentList C08 = new StudentList();
        C08.addStudent(SinhVien1);
        C08.addStudent(SinhVien2);
        C08.addStudent(SinhVien3);
        C08.searchNameStudent("Duc Anh");


    }
}
