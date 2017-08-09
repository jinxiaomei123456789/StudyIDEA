package pro4;

import java.util.Scanner;

/**排序
 * Created by Administrator on 2017/8/9.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();//接受用户输入的一串数字
        String[] c = s.split("\\s+");//用空格将其分割成字符串数字
        int size = c.length;
        int[] b =new int[size];
        for (int m = 0; m < b.length; m++) {
            b[m] = Integer.parseInt(c[m]);//讲字符串数组转换成int数组
        }
        int temp=0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length-i-1; j++) {
                if(b[j]>b[j+1]){
                    temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }

        for(int n = 0; n < b.length ; n++){
            System.out.print(b[n]);
            System.out.print(' ');
        }
        sc.close();
    }
}

