package Exercise.Ex7;

import java.util.ArrayList;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {
        // Bước 1: Tạo một ArrayList chứa các số nguyên
        List<Integer> integerList = new ArrayList<>();

        // Bước 2: Thêm phần tử vào danh sách
        integerList.add(5);
        integerList.add(2);
        integerList.add(8);
        integerList.add(1);
        integerList.add(7);

        // Bước 3: Tạo một ArrayList mới để lưu những số không chẵn
        List<Integer> oddNumbersList = removeEvenNumbers(integerList);

        // Bước 4: In ra danh sách mới
        System.out.println("Danh sách sau khi xóa số chẵn: " + oddNumbersList);
    }

    // Hàm xóa số chẵn khỏi danh sách
    private static List<Integer> removeEvenNumbers(List<Integer> list) {
        List<Integer> oddNumbersList = new ArrayList<>();

        // Duyệt danh sách để lọc những số không chẵn
        for (Integer number : list) {
            if (number % 2 != 0) {
                // Nếu số không chẵn, thêm vào danh sách mới
                oddNumbersList.add(number);
            }
        }

        return oddNumbersList;
    }
}