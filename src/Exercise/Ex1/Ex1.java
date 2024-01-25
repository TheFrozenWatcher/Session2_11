package Exercise.Ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        // Tạo một List ngẫu nhiên với số lượng phần tử ngẫu nhiên (tối đa 10)
        List<Integer> randomList = generateRandomList();

        // In ra List ngẫu nhiên
        System.out.println("Danh sách số nguyên ngẫu nhiên:");
        printList(randomList);

        // Tìm và in ra phần tử lớn nhất sử dụng Collections.max()
        Integer maxElement = Collections.max(randomList);
        System.out.println("Phần tử lớn nhất trong danh sách là: " + maxElement);
    }

    // Hàm tạo List ngẫu nhiên
    private static List<Integer> generateRandomList() {
        List<Integer> randomList = new ArrayList<>();
        int numberOfElements = (int) (Math.random() * 10) + 1; // Số lượng ngẫu nhiên từ 1 đến 10

        for (int i = 0; i < numberOfElements; i++) {
            int randomValue = (int) (Math.random() * 100); // Số nguyên ngẫu nhiên từ 0 đến 99
            randomList.add(randomValue);
        }

        return randomList;
    }

    // Hàm in ra List
    private static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(); // Xuống dòng sau khi in xong danh sách
    }
}