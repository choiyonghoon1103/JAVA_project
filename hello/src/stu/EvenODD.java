package stu;
import java.util.Scanner;

public class EvenODD {
	public static void main(String[] args) {
		int number;
	    Scanner input = new Scanner(System.in);
	    System.out.print("숫자를 입력하세요 : ");
	    number = input.nextInt();
	    if (number % 2 == 0) {System.out.print("짝");}
	    else {System.out.print("");}

	}
}
