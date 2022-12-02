package task22;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();


        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(1,100));
        }
        System.out.println("All numbers: " + numbers);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 1){
                oddNumbers.add(number);
            } else {
                evenNumbers.add(number);
            }
        }
        System.out.println("Odd numbers: " + oddNumbers);
        System.out.println("Even numbers: " + evenNumbers);
    }
}
