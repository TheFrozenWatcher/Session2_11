package Exercise.Ex15;

import java.util.Scanner;

public class TestManagement {
    public static void main(String[] args) {

        StudentManagement studentCrud = new StudentManagement();
        byte choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả sinh viên.");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4.Tìm theo id");
            System.out.println("5.Xem điểm trung bình");
            System.out.println("6.Sắp xếp theo điểm trung bình");
            System.out.println("7. Thoát chương trình");
            System.out.println("Nhập lựa chọn:");
            Scanner sc=new Scanner(System.in);
            choice=sc.nextByte();
            switch (choice){
                case 1:
                    studentCrud.showAll();
                    break;
                case 2:
                    studentCrud.addStudent();
                    break;
                case 3:
                    studentCrud.removeStudent();
                    break;
                case 4:
                    studentCrud.findStudentById();
                    break;
                case 5:
                    studentCrud.getAverageScore();
                    break;
                case 6:
                    studentCrud.sortByScore();
                    break;
                case 7:
                    System.exit(0);
                case 8:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }

        } while (choice!=7);
    }
}
