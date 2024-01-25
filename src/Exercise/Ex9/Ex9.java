package Exercise.Ex9;

import java.util.ArrayList;
import java.util.List;

public class Ex9 {
    public static void main(String[] args) {
        // Bước 1: Tạo một danh sách (List) chứa các số nguyên với phần tử trùng lặp
        List<Integer> originalList = new ArrayList<>();
        originalList.add(5);
        originalList.add(2);
        originalList.add(8);
        originalList.add(2);
        originalList.add(1);
        originalList.add(7);
        originalList.add(5);

        // Bước 2: Xóa phần tử trùng lặp
        List<Integer> uniqueList = removeDuplicates(originalList);

        // Bước 3: In ra danh sách mới
        System.out.println("Danh sách sau khi xóa phần tử trùng lặp: " + uniqueList);
    }

    // Hàm xóa phần tử trùng lặp
    private static List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> uniqueList = new ArrayList<>();

        // Duyệt danh sách gốc
        for (Integer element : list) {
            // Nếu phần tử chưa có trong danh sách mới, thêm vào
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }

        return uniqueList;
    }
}