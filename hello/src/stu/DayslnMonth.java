package stu;
import java.util.Scanner;
public class DayslnMonth {

	public static void main(String[] args) {
		String value;
		Scanner input = new Scanner(System.in);
		System.out.print("한글로 숫자를 입력하세요");
		value = input.next();
		
		switch(value){
		case "일":
		case "첫째":
		case "하나":
			System.out.print("1");
			break;
		}

	}

}
