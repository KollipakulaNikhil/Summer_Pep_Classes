import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        System.out.println("Enter "+a+" Elements: ");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Entered Elements: ");
        for(int x:arr){
            System.out.println(x);
        }
    }
}