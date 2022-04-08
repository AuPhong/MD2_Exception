package BaiTap;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

try {
    System.out.println("Insert 3 side of triangle: ");
    System.out.println("Insert a: ");
    int a = sc.nextInt();
    System.out.println("Insert b: ");
    int b = sc.nextInt();
    System.out.println("Insert c: ");
    int c = sc.nextInt();

    if (a <= 0 || c <= 0 || b <= 0 || a + b < c || a + c < b || b + c < a){
        throw new RuntimeException("This is not triangle");
    }
}
catch (RuntimeException e){
    System.out.println(e.getMessage());;
}



//        if (a < 0 || c < 0 || b < 0 || a + b < c || a + c < b || b + c < a){
//            throw new RuntimeException("This is not a triangle!");
//        }
//        else {
//            System.out.println("This is a triangle");
//        }


    }
}
