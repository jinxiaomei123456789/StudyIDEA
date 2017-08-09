package pro7;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/9.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] a = new int[count];
        for(int i=0;i<count;i++){
            a[i]=sc.nextInt();
        }
        int se = sc.nextInt();
        for(int i=0;i<count;i++){
            if(se==a[i]){
                System.out.println(i+1);
            }
        }
    }
}
