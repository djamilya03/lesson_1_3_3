import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] numbers = {1.5, 2.4, 5.3, -2.5, 4.1, 6.1, 7.4, -1.8, 8.1, 7.4, -5.9, 7.5, 6.2, 4.6, 9.9};
        boolean foundNegative = false;
        double sumOfAverage = 0.0;
        int count = 0;
        double sum = 0.0;
        System.out.println(Arrays.toString(numbers));
        for (double number : numbers) {
            if (number < 0) {
                foundNegative = true;
            }
            if (foundNegative && number > 0) {
                sum += number;
                count++;
            }
        }
        System.out.println(sum / count);


        int[] number = { -4 , 72 , 2 , - 33 ,1 ,9};
        for (int i = 0; i < number.length ; i++) {
            int min = number[i];
            int minId = i ;
            for (int j = i + 1; j < number.length ; j++) {
                if(number[j] < min ) {
                    min = number[j];
                    minId = j;


                }


            }
            int temp = number[i];
            number [i] = min ;
            number[minId] = temp;
            System.out.println(Arrays.toString(number));

        }

    }
}

















