import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] students = {-2.3, 3.8, 45.6, 3.9, -6.1, -9.3, 3.3, 4.1, 9.8, 2.5, -13.2, 14.3, 25.4, 34.5, -4.5};
        double summa = 0.0;
        int col = 0;
        boolean proverka = false;
        for (double foreach : students) {
            if (foreach < 0) {
                proverka = true;

            } else if (foreach > 0 && proverka) {
                summa += foreach;
                col++;
                System.out.println(foreach); }

        } System.out.println("Арифметичсекое число " + summa/col);
        int [] numbers = {9, -5, 8, -2, 6, 3, -4};
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length-1; i++) {

                if(numbers[i] > numbers[i+1]){ isSorted = false;
                    buf = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));

    }
}
