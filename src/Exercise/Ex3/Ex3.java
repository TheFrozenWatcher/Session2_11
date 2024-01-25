package Exercise.Ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        // Tạo một danh sách (List) chứa các số nguyên
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(2);
        integerList.add(8);
        integerList.add(1);
        integerList.add(7);

        // Sắp xếp danh sách theo thứ tự giảm dần
        sortDescending(integerList);

        // In ra danh sách đã sắp xếp
        System.out.println("Danh sách sau khi sắp xếp giảm dần: " + integerList);
    }

    // Hàm sắp xếp danh sách giảm dần
    private static void sortDescending(List<Integer> list) {
        // Sử dụng phương thức Collections.sort() với một Comparator ngược để sắp xếp giảm dần
        Collections.sort(list, Collections.reverseOrder());
    }
}
