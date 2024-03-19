import java.util.Scanner;
import java.util.Arrays;
public class MedianFive {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("양수를 입력하세요: ");
            int input = scanner.nextInt();
            while(input <= 0){
                System.out.print("양수가 아닙니다\n다시 양수를 입력하세요: ");
                input = scanner.nextInt();
            }
           numbers[i] = input;
        }
        Arrays.sort(numbers);
        System.out.println("가운데 값은: " + numbers[2]);
	}

}
