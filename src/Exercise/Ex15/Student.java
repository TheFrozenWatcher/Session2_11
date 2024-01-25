package Exercise.Ex15;

public class Student {
    private int studentId;
    private String studentName;
    private double averageScore;
    public Student (){}
    public Student(int studentId, String studentName, double averageScore){
        this.studentId=studentId;
        this.studentName=studentName;
        this.averageScore=averageScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
}
