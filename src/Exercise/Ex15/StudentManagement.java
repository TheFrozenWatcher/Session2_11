package Exercise.Ex15;

import java.util.*;

public class StudentManagement {
    private List<Student> studentList;

    public StudentManagement() {
        this.studentList = new ArrayList<>();
    }

    public void displayStudent(Student student){
        System.out.println("Id: " + student.getStudentId() + "; Name: " + student.getStudentName() + "; Average score: " + student.getAverageScore());

    }

    public void showAll() {
        if (studentList.size()==0){
            System.out.println("Danh sách rỗng");
            return;
        }
        for (Student student : studentList) {
            System.out.println("Id: " + student.getStudentId() + "; Name: " + student.getStudentName() + "; Average score: " + student.getAverageScore());
        }
    }

    //    Lấy vị trí theo id
    public int getStudentIndexById(int id) {
        int ind = -1;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId() == id) {
                ind = i;
            }
        }
        return ind;
    }

    //    Tìm sinh viên theo id
    public Student findStudentById() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = sc.nextInt();
        for (Student student:studentList) {
            if (student.getStudentId() == id) {
                System.out.println("Hiển thị thông tin sinh viên:");
                displayStudent(student);
                return student;
            }
        }
        System.out.println("Không tìm thấy sinh viên!");
        return null;
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = sc.nextInt();
        if (getStudentIndexById(id) != -1) {
            System.out.println("Id không hợp lệ!");
            return;
        }
        sc.nextLine();
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        System.out.println("Nhập điểm tb");
        double averageScore = sc.nextDouble();
        Student newStudent = new Student(id, name, averageScore);
        studentList.add(newStudent);
        System.out.println("Thêm mới thành công!");
    }

    public void removeStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = sc.nextInt();
        if (getStudentIndexById(id) == -1) {
            System.out.println("Id không hợp lệ!");
            return;
        }
        studentList.remove(getStudentIndexById(id));
        System.out.println("Xóa thành công!");
    }
    public void getAverageScore(){
        double totalScore=0;
        for(Student student:studentList){
            totalScore+=student.getAverageScore();
        }
        double averageScore=totalScore/studentList.size();
        System.out.println("Điểm trung bình là "+ averageScore);
    }
    public void sortByScore(){
        List<Student> sortedList=  new ArrayList<>(studentList);
        Collections.sort(sortedList, Comparator.comparingDouble(Student::getAverageScore));
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm:");
        for (Student student: sortedList){
            displayStudent(student);
        }
    }
}
