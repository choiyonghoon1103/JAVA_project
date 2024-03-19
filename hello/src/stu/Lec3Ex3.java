package stu;

public class Lec3Ex3 {
    public static void main(String[] args) {
        int max = 1000;
        System.out.println("1부터 " + max + "까지의 소수:");
        for (int i = 2; i <= max; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
