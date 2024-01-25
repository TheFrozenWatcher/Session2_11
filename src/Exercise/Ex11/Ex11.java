package Exercise.Ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {
        // Bước 1: Tạo một danh sách (List) chứa các số nguyên
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(2);
        integerList.add(8);
        integerList.add(1);
        integerList.add(7);

        // Bước 2: Tìm số nhỏ nhất trong danh sách
        int minValue = findMinNumber(integerList);

        // Bước 3: In ra kết quả
        System.out.println("Số nhỏ nhất trong danh sách là: " + minValue);
    }

    // Hàm tìm số nhỏ nhất trong danh sách
    private static int findMinNumber(List<Integer> list) {
        // Sử dụng phương thức Collections.min() để tìm số nhỏ nhất
        int minValue = Collections.min(list);
        return minValue;
    }
}