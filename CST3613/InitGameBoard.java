import java.util.ArrayList;
import java.util.List;

public class InitGameBoard {
    public static int randomInt(int m) {
        return (int) (Math.random() * m);
    }

    public static int[][] initialize(int n, int m) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n;j++)
                result[i][j] = randomInt (m);
        return result;
    }


    private static void showBoard(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0;j <a.length; j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 10;
        int range = 10;
        int[][] result = initialize(size, range);
        showBoard(result);
        System.out.println();

    }

}