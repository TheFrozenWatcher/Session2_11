package Exercise.Ex8;

import java.util.ArrayList;
import java.util.List;

public class Ex8 {
    public static void main(String[] args) {
        // Bước 1: Tạo một danh sách (List) chứa các số nguyên
        List<Integer> originalList = new ArrayList<>();
        originalList.add(5);
        originalList.add(2);
        originalList.add(8);
        originalList.add(1);
        originalList.add(7);

        // Bước 2: Tạo một danh sách mới và sao chép các phần tử từ danh sách gốc
        List<Integer> copiedList = copyList(originalList);

        // Bước 3: In ra danh sách mới
        System.out.println("Danh sách sao chép: " + copiedList);
    }

    // Hàm sao chép danh sách sử dụng phương thức addAll()
    private static List<Integer> copyList(List<Integer> originalList) {
        List<Integer> copiedList = new ArrayList<>();

        // Sử dụng phương thức addAll() để sao chép tất cả các phần tử
        copiedList.addAll(originalList);

        return copiedList;
    }
}