package Exercise.Ex14;

import java.util.ArrayList;
import java.util.Random;

public class Ex14 {
        public static void main(String[] args) {
            // Tạo ma trận vuông với kích thước ngẫu nhiên từ 1 đến 10
            int size = getRandomNumberInRange(1, 10);
            ArrayList<ArrayList<Integer>> squareMatrix = createSquareMatrix(size);

            // Thêm các phần tử ngẫu nhiên từ 0 đến 100 vào ma trận
            fillMatrixWithRandomValues(squareMatrix);

            // In ra ma trận
            printMatrix(squareMatrix);
        }

        // Tạo ma trận vuông với kích thước cho trước
        private static ArrayList<ArrayList<Integer>> createSquareMatrix(int size) {
            ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(size);

            for (int i = 0; i < size; i++) {
                ArrayList<Integer> row = new ArrayList<>(size);
                matrix.add(row);
            }

            return matrix;
        }

        // Thêm các phần tử ngẫu nhiên vào ma trận
        private static void fillMatrixWithRandomValues(ArrayList<ArrayList<Integer>> matrix) {
            Random random = new Random();

            for (ArrayList<Integer> row : matrix) {
                for (int j = 0; j < matrix.size(); j++) {
                    int randomValue = random.nextInt(101); // Giá trị từ 0 đến 100
                    row.add(randomValue);
                }
            }
        }

        // In ra ma trận
        private static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
            for (ArrayList<Integer> row : matrix) {
                for (Integer value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }

        // Sinh số ngẫu nhiên trong khoảng từ min đến max
        private static int getRandomNumberInRange(int min, int max) {
            Random random = new Random();
            return random.nextInt(max - min + 1) + min;
        }
}
