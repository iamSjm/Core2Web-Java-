import java.io.*;
import java.util.*;

public class Array {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements:");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count of even elements: " + count);
    }
}
