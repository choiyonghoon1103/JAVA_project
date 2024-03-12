import java.util.*;
import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
	  int year;
      GregorianCalendar gregori = new GregorianCalendar();
      Scanner input = new Scanner(System.in);
      System.out.print("몇년인지 입력하시오 : ");
      year = input.nextInt();
      if (gregori.isLeapYear(year))
        System.out.println("윤년입니다.");
      else
        System.out.println("평년입니다.");
  }
}