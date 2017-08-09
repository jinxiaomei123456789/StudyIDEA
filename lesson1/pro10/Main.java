package pro10;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/9.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=10000;i<999999;i++){
            int a=i%10;
            int b=i/10%10;
            int c=i/100%10;
            int d=i/1000%10;
            int e=i/10000%10;
            int f=i/100000;
            sum=a+b+c+d+e+f;
            if(f!=0){
                if(a==f&&b==e&&c==d&&sum==n){
                    System.out.println(i);
                }
            }else{
                if(a==e&&b==d&&sum==n){
                    System.out.println(i);
                }
            }

        }


    }
}
