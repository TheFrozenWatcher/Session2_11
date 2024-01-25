package Exercise.Ex5;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        // Bước 1: Tạo một chuỗi (câu hoặc đoạn văn)
        String inputText = "Viết chương trình cho sẵn một đoạn văn hoặc một câu, và tìm ra chữ ngắn nhất trong câu";

        // Bước 2: Convert chuỗi thành List<String>
        List<String> wordList = convertStringToList(inputText);

        // Bước 3: Tạo một List mới để lưu trữ các chuỗi ngắn nhất
        List<String> shortestStrings = findShortestStrings(wordList);

        // Bước 4: In ra kết quả
        System.out.println("Các chuỗi ngắn nhất trong câu là:");
        for (String shortestString : shortestStrings) {
            System.out.println(shortestString);
        }
    }

    // Hàm convert chuỗi thành List<String>
    private static List<String> convertStringToList(String inputText) {
        List<String> wordList = new ArrayList<>();
        // Sử dụng phương thức split() để tách chuỗi thành các từ
        String[] words = inputText.split("\\s+");
        // Thêm các từ vào List
        for (String word : words) {
            wordList.add(word);
        }
        return wordList;
    }

    // Hàm tìm chuỗi ngắn nhất trong danh sách
    private static List<String> findShortestStrings(List<String> wordList) {
        List<String> shortestStrings = new ArrayList<>();
        int minLength = Integer.MAX_VALUE;

        // Duyệt danh sách để tìm chiều dài ngắn nhất
        for (String word : wordList) {
            int currentLength = word.length();
            if (currentLength < minLength) {
                // Nếu tìm thấy chiều dài ngắn hơn, cập nhật chiều dài ngắn nhất và danh sách
                minLength = currentLength;
                shortestStrings.clear();
                shortestStrings.add(word);
            } else if (currentLength == minLength) {
                // Nếu có nhiều từ có chiều dài bằng nhau, thêm vào danh sách
                shortestStrings.add(word);
            }
        }

        return shortestStrings;
    }
}
