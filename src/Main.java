import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        Collection<Integer> newCollection = new ArrayList<>();
//        Thêm mới phần tử
        collection.add(10);
        collection.add(100);
        System.out.println(collection);
        newCollection.add(1000);
        //        Xóa phần tử
        collection.remove(10);
        boolean check = collection.remove(1);
        System.out.println(collection);
        System.out.println(check);

//  đếm số lần xuất hiện của 1 từ đã nhập trong 1 đoạn văn
        Scanner scanner = new Scanner(System.in);

        // Input the paragraph
        System.out.println("Enter the paragraph:");
        String paragraph = scanner.nextLine();

        // Input the word to count
        System.out.println("Enter the word to count:");
        String wordToCount = scanner.next();

        // Count occurrences using Collections
        Map<String, Integer> wordCountMap = countOccurrences(paragraph);

        // Display the result
        int count = wordCountMap.getOrDefault(wordToCount.toLowerCase(), 0);
        System.out.println("Occurrences of the word '" + wordToCount + "': " + count);
    }

    private static Map<String, Integer> countOccurrences(String paragraph) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = paragraph.split("\\s+");

        for (String word : words) {
            // Remove special characters (e.g., period, comma)
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "");
            cleanedWord = cleanedWord.toLowerCase();

            wordCountMap.put(cleanedWord, wordCountMap.getOrDefault(cleanedWord, 0) + 1);
        }

        return wordCountMap;
    }
}
