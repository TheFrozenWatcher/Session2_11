package Exercise.Ex6;

import java.util.ArrayList;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        // Bước 1: Tạo một danh sách (List) chứa các số nguyên
        List<Integer> integerList = new ArrayList<>();

        // Bước 2: Thêm phần tử vào danh sách
        integerList.add(5);
        integerList.add(2);
        integerList.add(8);
        integerList.add(1);
        integerList.add(7);

        // Bước 3: Sắp xếp danh sách theo thứ tự tăng dần (sử dụng thuật toán nổi bọt)
        bubbleSort(integerList);

        // Bước 4: In ra danh sách đã sắp xếp
        System.out.println("Danh sách sau khi sắp xếp tăng dần: " + integerList);
    }

    // Hàm sắp xếp danh sách bằng thuật toán nổi bọt
    private static void bubbleSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Hoán đổi phần tử nếu thứ tự không đúng
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
