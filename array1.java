import java.util.*;
public class array1 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter Array size");
        int size=sc.nextInt();

        int arr[]= new int[size];
           
            System.out.println("eneter element size");
            for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        
        }
    }
}
