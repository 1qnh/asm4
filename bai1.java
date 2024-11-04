package test;
public class bai1{
    public static void main(String[] args) {
        int sumOdd = 0;
        int sumEven = 0;
        for (int number = 1; number <= 100; number++) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number; 
            }
        }
        System.out.println("even total: " + sumEven);
        System.out.println("odd total: " + sumOdd);
    }
}

