import java.util.Scanner;

public class CheckWWW {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputstr;
		
		do {
			System.out.print("문자열을 입력하세요");
			inputstr = scanner.nextLine();
			if(inputstr.equalsIgnoreCase("quit")) {
				break;
			}
			else if (inputstr.startsWith("www")) {
				System.out.print(inputstr + "은 www로 시작됩니다\n");
			}
			else{
				System.out.print(inputstr + "은 www로 시작되지 않습니다\n");
			}
			
		} while(true);
		System.out.print("종료");
		scanner.close();
	}
}
