package stu;
import java.util.Scanner;
public class CheckIinput {

	public static void main(String[] args) {
		int number;
	    Scanner input = new Scanner(System.in);
	    System.out.print("숫자를 입력하세요 : ");
	    number = input.nextInt();
	    boolean inter = true;
	    if (number>=7 && number<=10) {inter=false;}
	    else {inter=true;}
	    while(inter) {
		    System.out.print("범위 내의 숫자가 아닙니다! 숫자를 입력하세요 : ");
		    number = input.nextInt();
		    if (number>=7 && number<=10) {inter=false;}
		    else {inter=true;}
	    }
	    System.out.print("범위내의 숫자입니다!: ");
	}

}
