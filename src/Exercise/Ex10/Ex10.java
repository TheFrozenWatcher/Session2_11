package Exercise.Ex10;
import java.util.ArrayList;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        // Bước 1: Tạo một danh sách (List) chứa các số nguyên
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(2);
        integerList.add(8);
        integerList.add(1);
        integerList.add(7);

        // Bước 2: Tính tổng của các phần tử trong danh sách
        int sum = calculateSum(integerList);

        // Bước 3: In ra kết quả
        System.out.println("Tổng của các phần tử trong danh sách là: " + sum);
    }

    // Hàm tính tổng của các phần tử trong danh sách
    private static int calculateSum(List<Integer> list) {
        int sum = 0;

        // Sử dụng phương thức forEach để duyệt qua từng phần tử trong danh sách
        for (int element : list) {
            sum += element;
        }

        return sum;
    }
}