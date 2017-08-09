package pro6;

/**
 * Created by Administrator on 2017/8/9.
 */
public class Main {
    public static void main(String[] args) {
        int count = 1000;
        while(count>=1000&&count<=9999){
            int a=count%10;//个位数字
            int b=count/10%10;//十位数组
            int c=count/100%10;//百位数字
            int d=count/1000;
            if(a==d&&b==c){
                System.out.print(count+"  ");
            }
            count++;
        }
    }
}
