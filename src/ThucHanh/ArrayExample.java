package ThucHanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static int[] createRandom(){
        Random rd = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+"\t");
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        try{
//            int[] arr = createRandom();
//
//            System.out.println("\nInput index: ");
//            int index = sc.nextInt();
//            System.out.println("Value: "+arr[index]);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Please enter index less than 100");
//        }
//        finally {
//            sc.close();
//        }

        int[] arr = createRandom();

        System.out.println("\nInput index: ");
        int index = sc.nextInt();
        if (index>=100){
            throw new ArithmeticException("Please enter index less than 100");
        }
        System.out.println("Value: "+arr[index]);

    }
}
