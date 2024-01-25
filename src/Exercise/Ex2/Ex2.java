package Exercise.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        // Bước 1: Tạo một danh sách (List)
        List<Integer> originalList = new ArrayList<>();

        // Bước 2: Thêm một số phần tử vào danh sách
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);

        // Bước 3: Duyệt và đảo ngược danh sách
        List<Integer> reversedList = reverseList(originalList);

        // In ra danh sách gốc
        System.out.println("Danh sách gốc: " + originalList);

        // In ra danh sách đảo ngược
        System.out.println("Danh sách đảo ngược: " + reversedList);
    }

    // Hàm đảo ngược danh sách
    private static List<Integer> reverseList(List<Integer> originalList) {
        List<Integer> reversedList = new ArrayList<>();

        // Duyệt từ cuối danh sách gốc đến đầu và thêm từng phần tử vào danh sách đảo ngược
        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }

        return reversedList;
    }
}
