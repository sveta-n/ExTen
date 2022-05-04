import java.util.Scanner;
import java.util.Arrays;

public class ExTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите высоту матрицы: ");
        int height = scanner.nextInt();
        System.out.println("Укажите длину матрицы: ");
        int length = scanner.nextInt();

        int[][] matrix = new int[height][length];

        for (int i = 0; i < height; i++){
            for (int j = 0; j < length; j++){
                System.out.println("Заполните матрицу данными: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < length; i++){
            matrix[0][i] = matrix[0][i] * 3;
        }
        System.out.println(Arrays.toString(matrix[0]));
    }
}
