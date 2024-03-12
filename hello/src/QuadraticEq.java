import java.util.Scanner;

public class QuadraticEq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int a = 1;
        double b, c;
        double discriminator, root1, root2;
 
        System.out.print("일차항 계수 b를 입력하세요: ");
        b = input.nextFloat();
 
        System.out.print("상수 c를 입력하세요: ");
        c = input.nextFloat();
        discriminator = b * b - 4 * a * c;
 
        if (discriminator > 0) {
            root1 = (-b + Math.sqrt(discriminator)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminator)) / (2 * a);
            System.out.printf("근 : %.2f, %.2f", root1, root2);
        } else if (discriminator == 0) {
            root1 = -b / (2 * a);
            System.out.printf("중근: %.2f",root1);
        } else {
            System.out.println("실근이 존재하지 않습니다.");
        }
        input.close();
    }
}
