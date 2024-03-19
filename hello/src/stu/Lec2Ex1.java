package stu;
import java.util.Scanner;
public class Lec2Ex1 {

	public static void main(String[] args) {
		int number1, number2;
	    Scanner input = new Scanner(System.in);
	    System.out.print("첫 번째 숫자를 입력하세요 : ");
	    number1 = input.nextInt();
	    System.out.print("두 번째 숫자를 입력하세요 : ");
	    number2 = input.nextInt();
	    if (number1 > number2) {System.out.printf("큰수는 %d",number1);}
	    else {System.out.printf("큰수는 %d",number2);}

	}

}

