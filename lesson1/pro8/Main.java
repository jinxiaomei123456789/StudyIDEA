package pro8;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/9.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int max = 0;
        int count=0;
        int[] a = new int[sum];
       for(int i=0;i<sum;i++){
           a[i]=sc.nextInt();
           count=count+a[i];
       }
       int min = a[0];
       for(int i=0;i<sum;i++){
           if(a[i]>max){
               max=a[i];
           }
           if(a[i]<min){
               min=a[i];
           }
       }
        System.out.println(max);
        System.out.println(min);
        System.out.println(count);


    }
}
