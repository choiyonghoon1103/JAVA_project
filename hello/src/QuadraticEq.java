import java.util.Scanner;

public class QuadraticEq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 1;
        double b, c;
        double discriminer, root1, root2;
 
        System.out.print("일차항 계수 b를 입력하세요: ");
        b = input.nextFloat();
 
        System.out.print("상수 c를 입력하세요: ");
        c = input.nextFloat();
        discriminer = b * b - 4 * a * c;
 
        if (discriminer > 0) {
            root1 = (-b + Math.sqrt(discriminer)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminer)) / (2 * a);
            System.out.println("근 :" + root1 + ", " + root2);
        } else if (discriminer == 0) {
            root1 = -b / (2 * a);
            System.out.println("중근: " + root1);
        } else {
            System.out.println("실근이 존재하지 않습니다.");
        }
        input.close();
    }
}
