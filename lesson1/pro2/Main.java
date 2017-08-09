package pro2;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/9.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  r = sc.nextInt();
        double s = Math.PI*r*r;
        NumberFormat nf = NumberFormat.getNumberInstance();//NumberFormat及保存小数的方法
        nf.setMaximumFractionDigits(7);
        System.out.println(nf.format(s));

    }



}
