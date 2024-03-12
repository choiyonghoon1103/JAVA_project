package stu;
import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		int x, y, sum;
		Scanner input = new Scanner(System.in);
		System.out.printf("첫번째 숫자를 입력하시오: ");
		x  = input.nextInt();
		System.out.printf("두번째 숫자를 입력하시오: ");
		y  = input.nextInt();
		sum = x + y;
		System.out.printf("%d와 %d의 합 : %d", x, y, sum);
	}

}
