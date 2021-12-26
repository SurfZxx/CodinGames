import java.util.Scanner;
import java.util.*;

public class App {
    
        public static void reverse(int[] array) {
            int i = 0;
            int j = array.length - 1;
            int tmp;
            while (j > i) {
                tmp = array[j];
                array[j] = array[i];
                array[i] = tmp;
                j--;
                i++;
            }
        }
    
        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt(); // the number of temperatures to analyse
            int[] temps = new int[n];
            int almostZero = 5526;
            for (int i = 0; i < n; i++) {
                temps[i] = scanner.nextInt();//a temperature expressed as an integer ranging from -273 to 5526
            }
            for (int i = 1; i < n; i++) {
                if ((Math.abs(temps[i]) < Math.abs(temps[i-1])) && (almostZero > temps[i]) ) {
                    almostZero = temps[i];
                } else if ((Math.abs(temps[i]) < Math.abs(temps[i-1])) && (almostZero > temps[i-1])) {
                    almostZero = temps[i-1];
                }
            }

    
            // int[] temp2 = new int[n];
            // int counter = 0;
            // for (int i = 0; i < n; i++) {
            //     if (temps[i] < 0) {
            //         temp2[i] = temps[i] * (-1);
            //         counter++;
            //     } else {
            //         temp2[i] = temps[i];
            //         counter++;
            //     }
            // }
            // Arrays.sort(temp2);
            // reverse(temp2);
            // int almostZero = temp2[counter-1];
            
            
            
    /*
            int[] temp2 = new int[n];
            int almostZero = 1000;
            System.arraycopy(temps, 0, temp2, 0, n);
            for (int i = 0; i < n; i++) {
                temp2[i] = Math.abs(temp2[i]);
            }
    
            for (int i = 0; i < n; i++) {
                if (temp2[i] < Math.abs(almostZero)) {
                    almostZero = temps[i];
                }
            }
    */
    
            System.out.println(almostZero);
            scanner.close();
    }
}
