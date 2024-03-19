import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		int number;
	    Scanner input = new Scanner(System.in);
	    System.out.print("숫자를 입력하세요 : ");
	    number = input.nextInt();
	    if (number % 3 == 0) {System.out.print("3의 배수입니다");}
	    else {System.out.print("3의 배수가 아닙니다");}

	}

}
