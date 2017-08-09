package pro5;

/**
 * Created by Administrator on 2017/8/9.
 */
public class Main {
    public static void main(String[] args) {
        int count = 100;
        String s = "";
        while(count>=100&&count<=999){
            int a = count%10;//个位数
            int b = count/10%10;//十位数
            int c = count/100;//百位数
            if(count==a*a*a+b*b*b+c*c*c) {
                s = s + count+",";
            }
            count++;
        }
        String[] total = s.split(",");

        for(int i=0;i<total.length;i++){
            System.out.println(total[i]);
        }
    }
}
