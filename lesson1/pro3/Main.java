package pro3;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/9.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.print(sum);
    }
}
