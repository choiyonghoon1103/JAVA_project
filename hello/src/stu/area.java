package stu;

public class area {
    public static void main(String[] args) {
        double radius = 10;
        double area;
        final double PI = 3.141592;
        area = PI * radius * radius;
        System.out.printf("반지름이 %.1f인 원의 넓이 : %f", radius, area);
    }

}