package Exercise.Ex4;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        // Bước 1: Tạo một chuỗi
        String inputString = "Rekkei Academy để nông dân biết code";

        // Bước 2: Tạo một List chứa các chuỗi
        List<String> stringList = new ArrayList<>();

        // Bước 3: Convert chuỗi thành List<String> và gán vào List đã tạo
        convertStringToList(inputString, stringList);

        // Bước 4: Duyệt List và in ra các chuỗi có độ dài lớn hơn 3
        printStringsLongerThan3(stringList);
    }

    // Hàm convert chuỗi thành List<String>
    private static void convertStringToList(String inputString, List<String> stringList) {
        // Sử dụng phương thức split() để tách chuỗi thành các từ
        String[] words = inputString.split("\\s+");

        // Thêm các từ vào List
        for (String word : words) {
            stringList.add(word);
        }
    }

    // Hàm in ra các chuỗi có độ dài lớn hơn 3
    private static void printStringsLongerThan3(List<String> stringList) {
        System.out.println("Các chuỗi có độ dài lớn hơn 3:");
        for (String str : stringList) {
            if (str.length() > 3) {
                System.out.println(str);
            }
        }
    }
}
