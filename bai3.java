package bai3;
public class bai3 {
    public static boolean ngto(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { 
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("cac so nguyen to 1-100");

        // Duyệt qua các số từ 1 đến 100 và in ra các số nguyên tố
        for (int num = 1; num <= 100; num++) {
            if (ngto(num)) {
                System.out.print(num + " ");
            }
        }
    }
}

