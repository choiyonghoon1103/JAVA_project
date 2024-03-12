import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
	  int year;
      Scanner input = new Scanner(System.in);
      System.out.print("몇년인지 입력하시오 : ");
      year = input.nextInt();
      boolean dis = true;
      if (year % 2 != 0)
    	  dis = false;
      if (dis)
        System.out.println("윤년입니다.");
      else
        System.out.println("평년입니다.");
  }
}